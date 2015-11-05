package com.alchemytec.core;

import java.util.Date;

public class Expense {

    private long id;
    private Date date;
    private Double amount;
    private String reason;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Expense(long id, Date date, Double amount, String reason) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.reason = reason;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
