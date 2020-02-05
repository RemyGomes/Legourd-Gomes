package com.example.pam_f5_2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);
        model.getRandomsCocktails();

        //String s = "coucou";
        TextView tv = findViewById(R.id.activity_main_TextViw_center);
    }
}
