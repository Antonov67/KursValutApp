package com.example.kursvalutapp;

import com.google.gson.annotations.SerializedName;

public class USD {

    @SerializedName("Name")
    private String name;
    @SerializedName("Value")
    private double value;
    @SerializedName("Previous")
    private double previous;

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public double getPrevious() {
        return previous;
    }
}
