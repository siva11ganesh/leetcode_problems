package com.pattern.singleton;

public class Transaction implements Cloneable{

    private String txnId;
    private String payerName;
    private Double amount = 0.00;

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "txnId='" + txnId + '\'' +
                ", payerName='" + payerName + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public Transaction clone() {
        try {
            return (Transaction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
