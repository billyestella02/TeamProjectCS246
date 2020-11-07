package com.example.teamprojectcs246;

import java.util.Date;

public class Savings {
    private double savings;
    private Date dateAdded;

    public Savings(double savings) {
        this.savings = savings;
    }

    public void addSavings(double savings) {
        this.savings = savings;
        dateAdded = new Date();
    }

    public double getSavings() {
        return savings;
    }
}
