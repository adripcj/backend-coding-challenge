package com.alchemytec.controllers;

import java.util.ArrayList;
import java.util.List;

import com.alchemytec.api.ExpenseDTO;
import com.alchemytec.core.Expense;
import com.alchemytec.jdbi.ExpenseDAO;

public class ExpenseController {

    private final ExpenseDAO expenseDao;
    
    public ExpenseController(ExpenseDAO expenseDao) {
        this.expenseDao = expenseDao;
    }

    public void saveExpense(ExpenseDTO expense) {
        this.expenseDao.insert(expense.getAmount(), expense.getDate(), expense.getReason());
    }
    
    public List<ExpenseDTO> findAllExpenses() {
        List<ExpenseDTO> expensesDto = new ArrayList<ExpenseDTO>();
        List<Expense> expenses = this.expenseDao.findAll();
        expenses.forEach((expense) -> expensesDto.add(new ExpenseDTO(expense)));
        return expensesDto;
    }

}
