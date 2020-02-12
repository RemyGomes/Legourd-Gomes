package com.example.pam_f5_2020;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.pam_f5_2020.model.Cocktail;
import com.example.pam_f5_2020.model.CocktailResponse;
import com.example.pam_f5_2020.rest.CocktailService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyViewModel extends ViewModel {
    private CocktailResponse cocktails;

    private CocktailService cocktailService;

    public MyViewModel(){
        // Retrofit
        // Appel réseau
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.thecocktaildb.com/api/json/v1/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        cocktailService = retrofit.create(CocktailService.class);
    }

    // Crée une liste de cocktails randoms
    public void getRandomsCocktails(CallbackRequestFinished callback) {
        if (cocktails == null) {
            cocktails = new CocktailResponse();
            getRandomCocktail(callback);
        }
        callback.onFinish(cocktails);
    }

    // Méthodes pour get les cocktails

    private void getCocktails(String cocktailName) {
        // Nom de cocktail composé
        if (cocktailName.contains(" ")) {
            cocktailName = cocktailName.trim().replaceAll(" ", "%20");
        }
        Call<CocktailResponse> cocktails = cocktailService.listCocktails(cocktailName);

    }

    private void getRandomCocktail(CallbackRequestFinished callback) {
        Call<CocktailResponse> cocktail = cocktailService.randomCocktail();
        cocktail.enqueue(new Callback<CocktailResponse>() {
            @Override
            public void onResponse(Call<CocktailResponse> call, Response<CocktailResponse> response) {
                cocktails = response.body();
                Log.d("MyViewModel", response.body().getDrinks().get(0).toString());
                callback.onFinish(cocktails);
            }

            @Override
            public void onFailure(Call<CocktailResponse> call, Throwable t) {

            }
        });
    }
}
