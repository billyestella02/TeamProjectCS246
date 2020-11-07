package com.example.teamprojectcs246;

import java.util.Date;

public class Income {
    private double income;
    private Date dateAdded;

    // Constructor
    public Income(double income) {
        this.income = income;
    }

    // Add income, multiple incomes will be saved as one income
    public void addIncome(double income) {
        this.income = this.income + income;
        dateAdded = new Date();
    }

    // return the total income amount
    public double getIncome() {
        return income;
    }
}
