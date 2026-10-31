package com.example.kursvalutapp;

import com.google.gson.annotations.SerializedName;

public class Valute {

    @SerializedName("USD")
    private USD usd;

    public USD getUsd() {
        return usd;
    }
}
