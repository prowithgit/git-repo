package com.training1.model;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;
    private String name;
    private String password;
    private double balance;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
