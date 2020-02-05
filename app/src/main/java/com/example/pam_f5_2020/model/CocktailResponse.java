package com.example.pam_f5_2020.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CocktailResponse {

    @SerializedName("drinks")
    @Expose
    private List<Cocktail> drinks;

    public List<Cocktail> getDrinks() {
        return drinks;
    }
}
