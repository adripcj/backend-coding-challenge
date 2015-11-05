package com.alchemytec.api;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.alchemytec.core.Expense;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpenseDTO {

    private long id;
    
    @NotNull
    @Min(0)
    @Max(9999999)
    private Double amount;
    
    @NotNull
    private Date date;

    @NotNull
    private String reason;

    public ExpenseDTO() {
        // Jackson deserialization
    }

    public ExpenseDTO(long id, Date date, Double amount, String reason) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.reason = reason;
    }
    
    public ExpenseDTO(Expense expense) {
        this.id = expense.getId();
        this.date = expense.getDate();
        this.amount = expense.getAmount();
        this.reason = expense.getReason();
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public Date getDate() {
        return date;
    }

    @JsonProperty
    public Double getAmount() {
        return amount;
    }

    @JsonProperty
    public String getReason() {
        return reason;
    }

}
