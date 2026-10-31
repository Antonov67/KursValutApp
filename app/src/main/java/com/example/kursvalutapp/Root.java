package com.example.kursvalutapp;

import com.google.gson.annotations.SerializedName;

public class Root {
    @SerializedName("Valute")
    private Valute valute;

    public Valute getValute() {
        return valute;
    }
}
