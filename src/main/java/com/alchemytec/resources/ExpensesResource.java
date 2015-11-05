package com.alchemytec.resources;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.alchemytec.api.ExpenseDTO;
import com.alchemytec.controllers.ExpenseController;
import com.codahale.metrics.annotation.Timed;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/expenses")
public class ExpensesResource {
    
    private final ExpenseController expenseController;

    public ExpensesResource(ExpenseController expenseController) {
        this.expenseController = expenseController;
    }

    @POST
    @Timed
    public Response saveExpense(@Valid ExpenseDTO expense) {
        this.expenseController.saveExpense(expense);
        return Response.ok().build();
    }
    
    @GET
    @Timed
    public List<ExpenseDTO> findAllExpenses() {
        List<ExpenseDTO> expensesDto = this.expenseController.findAllExpenses();
        return expensesDto;
    }
}
