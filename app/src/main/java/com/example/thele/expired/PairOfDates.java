package com.example.thele.expired;
public class PairOfDates
{
    private String itemName;
    private int fridgeDate;
    private int freezerDate;
    public PairOfDates(String name, int fridge, int freezer)
    {
        super();
        this.itemName = name;
        this.fridgeDate = fridge;
        this.freezerDate = freezer;
    }

    public String getName() { return itemName; };
    public int getFridge() { return fridgeDate; };
    public int getFreezer() { return freezerDate; };
}