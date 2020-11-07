package com.example.teamprojectcs246;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Expense {
    private String expenseName;
    private double amount;

    // Constructor
    public Expense(String expenseName, double amount) {
        this.expenseName = expenseName;
        this.amount = amount;
    }

    public void addExpense(String expenseName, double amount) {
        this.expenseName = expenseName;
        this.amount = amount;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public double getAmount() {
        return amount;
    }
}
