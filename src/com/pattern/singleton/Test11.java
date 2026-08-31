package com.pattern.singleton;

public class Test11 {

    public static void main(String[] args) {
        Transaction txn = new Transaction();

        txn.setTxnId("1");
        txn.setAmount(1000.00);
        txn.setPayerName("Siva");

        System.out.println(txn);

        Transaction tt = txn.clone();

        System.out.println(tt);
    }
}
