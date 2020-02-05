package com.example.pam_f5_2020.rest;


import com.example.pam_f5_2020.model.CocktailResponse;

import java.util.List;

import retrofit2.*;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CocktailService {
    @GET("search.php?s={cocktailName}")
    Call<CocktailResponse> listCocktails(@Path("cocktailName") String cocktailName);

    @GET("random.php")
    Call<CocktailResponse> randomCocktail();
}
