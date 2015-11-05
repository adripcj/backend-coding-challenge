package com.alchemytec.jdbi;

import java.util.Date;
import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import com.alchemytec.core.Expense;
import com.alchemytec.core.ExpenseMapper;

@RegisterMapper(ExpenseMapper.class)
public interface ExpenseDAO {

    @SqlUpdate("create table expense "
            + "(id int primary key not null auto_increment,"
            + " amount decimal(10,2),"
            + " date date,"
            + " reason varchar(100))")
    void createExpenseTable();

    @SqlUpdate("insert into expense (amount, date, reason)"
            + " values (:amount, :date, :reason)")
    void insert(@Bind("amount") Double amount, @Bind("date") Date date, 
                @Bind("reason") String reason);

    @SqlQuery("select id, amount, date, reason from expense")
    List<Expense> findAll();

    void close();
}
