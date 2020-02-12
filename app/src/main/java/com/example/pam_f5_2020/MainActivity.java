package com.example.pam_f5_2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.pam_f5_2020.model.Cocktail;
import com.example.pam_f5_2020.model.CocktailResponse;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<Cocktail> drinksNames = new ArrayList<Cocktail>();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView tv = findViewById(R.id.activity_main_TextViw_center);

        recyclerView = (RecyclerView) findViewById(R.id.cocktailLayout_recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);



        MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);
        model.getRandomsCocktails(new CallbackRequestFinished(){

            @Override
            public void onFinish(CocktailResponse cocktails) {
                if (cocktails.getDrinks() != null) {
                    //tv.setText(cocktails.getDrinks().get(0).toString());
                    //Log.d("Main", "" + cocktails.getDrinks().get(0).toString());
                    // Log.d("MainActivity", "" + cocktailList.size());
                    for(Cocktail c : cocktails.getDrinks()) {
                        drinksNames.add(c);
                    }
                    mAdapter = new CocktailAdapter(drinksNames);
                    recyclerView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onError(Throwable t) {
                //Snackbar.make(tv, "Erreur réseau : " + t.getMessage(),Snackbar.LENGTH_LONG).show();
                t.printStackTrace();
            }
        });



    }
}
