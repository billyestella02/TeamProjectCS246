package com.example.teamprojectcs246;

import java.util.ArrayList;

public class Budget {
    private Income income;
    private Savings savings;
    private Expense expense;

    private ArrayList<Income> incomeList = new ArrayList<>();
    private ArrayList<Savings> savingsList = new ArrayList<>();
    private ArrayList<Expense> expensesList = new ArrayList<>();

    // Get total income
    public double getTotalIncome() {
        if (incomeList.size() == 1) {
            return incomeList.get(0).getIncome();
        } else {
            double totalIncome = 0.00;
            for (int i = 0; i < incomeList.size(); i++) {
                totalIncome += incomeList.get(i).getIncome();
            }
            return totalIncome;
        }
    }

    // Get total savings
    public double getTotalSavings() {
        if (savingsList.size() == 1) {
            return savingsList.get(0).getSavings();
        } else {
            double totalSavings = 0.00;
            for (int i = 0; i < savingsList.size(); i++) {
                totalSavings += savingsList.get(i).getSavings();
            }
            return totalSavings;
        }
    }

    // Get total expenses
    public double getTotalExpenses() {
        if (expensesList.size() == 1) {
            return expensesList.get(0).getAmount();
        } else {
            double totalExpenses = 0.00;
            for (int i = 0; i < expensesList.size(); i++) {
                totalExpenses += expensesList.get(i).getAmount();
            }
            return totalExpenses;
        }
    }
}