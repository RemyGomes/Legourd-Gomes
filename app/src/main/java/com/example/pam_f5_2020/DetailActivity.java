package com.example.pam_f5_2020;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pam_f5_2020.model.Cocktail;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cocktail_detail_layout);
        TextView tv = findViewById(R.id.detail);
        ImageView iv = findViewById(R.id.imageViewCocktail);

        Intent startingIntent = getIntent();
        Cocktail cocktail = (Cocktail) startingIntent.getSerializableExtra("data");

        tv.setText(cocktail.toString());

        Picasso.get()
                .load(cocktail.getStrDrinkThumb())
                .transform(new CircleTransform(500,50))
                .into(iv);

    }
}
