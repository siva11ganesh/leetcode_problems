package com.pin;

import javax.crypto.Cipher;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HexFormat;

public final class IsoPinBlockUtil {

    private static final HexFormat HEX = HexFormat.of();

    private IsoPinBlockUtil() {
    }

    /**
     * Generates encrypted ISO-9564 Format-0 PIN Block.
     *
     * @param pin             PIN value (4-12 digits)
     * @param pan             PAN/Card Number
     * @param certificatePath X509 certificate path
     * @return Encrypted PIN block (Hex String)
     */
    public static String generateEncryptedPinBlock(
            String pin,
            String pan,
            Path certificatePath) throws Exception {

        validatePin(pin);
        validatePan(pan);

        String pinField = createPinField(pin);

        System.out.println("PIN:" + pinField);

        String panField = createPanField(pan);
        System.out.println("PAN:" + panField);

        byte[] pinBytes = HEX.parseHex(pinField);
        byte[] panBytes = HEX.parseHex(panField);


        byte[] pinBlock = xor(pinBytes, panBytes);

        System.out.println("PIN BLOCK:" + Arrays.toString(pinBlock));

        PublicKey publicKey = loadPublicKey(certificatePath);

        System.out.println("PublicKey:" + publicKey);

        byte[] encrypted = encryptRSA(pinBlock, publicKey);

        System.out.println("Encrypted bytes : " + encrypted.length);

        return HEX.formatHex(encrypted);
    }

    /**
     * Step 1-3
     */
    private static String createPinField(String pin) {

        StringBuilder sb = new StringBuilder();

        sb.append('0');                      // Format 0
        sb.append(Integer.toHexString(pin.length()).toUpperCase());
        sb.append(pin);

        while (sb.length() < 16) {
            sb.append('F');
        }

        return sb.toString();
    }

    /**
     * Step 4
     */
    private static String createPanField(String pan) {

        String panWithoutCheckDigit =
                pan.substring(0, pan.length() - 1);

        String rightMost12 =
                panWithoutCheckDigit.substring(
                        panWithoutCheckDigit.length() - 12);

        return "0000" + rightMost12;
    }

    private static byte[] xor(byte[] a, byte[] b) {

        byte[] out = new byte[a.length];

        for (int i = 0; i < a.length; i++) {
            out[i] = (byte) (a[i] ^ b[i]);
        }

        return out;
    }

    /**
     * Reads X509 certificate (.cer/.crt)
     */
    private static PublicKey loadPublicKey(Path certificateFile) throws Exception {

        String certificate = Files.readString(certificateFile);

        CertificateFactory certificateFactory =
                CertificateFactory.getInstance("X.509");

        try (InputStream inputStream = new ByteArrayInputStream(certificate.getBytes(StandardCharsets.UTF_8))) {

            X509Certificate x509Certificate =
                    (X509Certificate) certificateFactory.generateCertificate(inputStream);

            return x509Certificate.getPublicKey();
        }
    }

    /**
     * RSA Encryption
     */
    private static byte[] encryptRSA(byte[] pinBlock,
                                     PublicKey publicKey)
            throws Exception {

        Cipher cipher =
                Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        return cipher.doFinal(pinBlock);
    }

    private static void validatePin(String pin) {

        if (!pin.matches("\\d{4,12}")) {
            throw new IllegalArgumentException(
                    "PIN must contain 4-12 digits.");
        }
    }

    private static void validatePan(String pan) {

        if (!pan.matches("\\d{13,19}")) {
            throw new IllegalArgumentException(
                    "Invalid PAN.");
        }
    }

    public static void main(String[] args) throws Exception {

        String pin = "1234";

        String pan = "5302801279096601";

        Path cert = Path.of("D:\\ZenusBank\\publicCer.txt");

        String encrypted =
                IsoPinBlockUtil.generateEncryptedPinBlock(
                        pin,
                        pan,
                        cert);

//        String encryptedPin = Base64.getEncoder().encodeToString(encrypted.getBytes());
        System.out.println("len:" + encrypted.length());
        System.out.println("Ecn:" + encrypted);
    }
}