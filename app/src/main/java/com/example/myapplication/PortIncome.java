package com.example.myapplication;

public class PortIncome {
    private int id;
    private String incomeName;
    private int incomeAmount;

    public PortIncome(int id, String incomeName, int incomeAmount) {
        this.id = id;
        this.incomeName = incomeName;
        this.incomeAmount = incomeAmount;
    }

    public int calculateIncome() {
        return incomeAmount;
    }
}