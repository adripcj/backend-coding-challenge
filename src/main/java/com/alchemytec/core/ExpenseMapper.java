package com.alchemytec.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.alchemytec.jdbi.ExpenseDAO;

/**
 * Mapper used by {@link ExpenseDAO} to transform the result set into a domain
 * object.
 */
public class ExpenseMapper implements ResultSetMapper<Expense> {
    public Expense map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new Expense(r.getLong("id"), r.getDate("date"), r.getDouble("amount"), r.getString("reason"));
    }
}