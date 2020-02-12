package com.example.pam_f5_2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.pam_f5_2020.model.Cocktail;
import com.example.pam_f5_2020.model.CocktailResponse;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.activity_main_TextViw_center);
        MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);
        model.getRandomsCocktails(new CallbackRequestFinished(){

            @Override
            public void onFinish(CocktailResponse cocktails) {
                if (cocktails.getDrinks() != null) {
                    tv.setText("OK");
                    Log.d("Main", "" + cocktails.getDrinks().get(0).toString());
                    // Log.d("MainActivity", "" + cocktailList.size());
                }
            }
        });
    }
}
