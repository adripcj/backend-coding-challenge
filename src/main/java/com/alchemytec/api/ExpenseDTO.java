package com.alchemytec.api;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.alchemytec.core.Expense;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpenseDTO {

    private long id;
    private static final int MAX_EXPENSE_AMOUNT = 9999999;
    
    @NotNull
    @Min(0)
    @Max(MAX_EXPENSE_AMOUNT)
    private Double amount;
    
    @NotNull
    private Date date;

    @NotNull
    @Size(min = 1, max = 100)
    private String reason;

    public ExpenseDTO() {
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
