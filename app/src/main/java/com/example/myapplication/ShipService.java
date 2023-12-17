package com.example.myapplication;

import com.example.myapplication.PortIncome;

public class ShipService extends PortIncome {
    private int shipCount;
    private int serviceCost;

    public ShipService(int id, String incomeName, int shipCount, int serviceCost) {
        super(id, incomeName, 0);
        this.shipCount = shipCount;
        this.serviceCost = serviceCost;
    }

    @Override
    public int calculateIncome() {
        return shipCount * serviceCost;
    }
}
