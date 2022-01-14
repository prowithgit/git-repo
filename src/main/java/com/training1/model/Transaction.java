package com.training1.model;

import javax.persistence.*;

@Entity
@Table(name = "Transaction")
public class Transaction
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int txnId;
    private String txnType;
    private  int custId;
    private double amount;

    public int getTxnId() {
        return txnId;
    }

    public void setTxnId(int txnId) {
        this.txnId = txnId;
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "txnId=" + txnId +
                ", txntype='" + txnType + '\'' +
                ", custId=" + custId +
                ", amount=" + amount +
                '}';
    }
}
