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
        ImageView iv = findViewById(R.id.imageViewCocktail);
        TextView cocktailName = findViewById(R.id.CocktailName);
        TextView isAlcoholic = findViewById(R.id.isAlcoholic);
        TextView cocktailIngredients = findViewById(R.id.CocktailIngredients);
        TextView cocktailIngredientsTitre = findViewById(R.id.CocktailIngredientsTitre);
        TextView instructions = findViewById(R.id.Instructions);
        Intent startingIntent = getIntent();
        Cocktail cocktail = (Cocktail) startingIntent.getSerializableExtra("data");


        // Cocktail name
        cocktailName.setText(cocktail.getStrDrink());
        // Is Alcohocic
        isAlcoholic.setText("\tAlcoholic: \t\t" + getEmoji((cocktail.isAlcoholic())));

        cocktailIngredientsTitre.setText("\tIngredients:");

        // Ingredients
        try {
            cocktailIngredients.setText(cocktail.getIngredients());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        // Instructions
        instructions.setText("Instructions : " + cocktail.getStrInstructions());

        Picasso.get()
                .load(cocktail.getStrDrinkThumb())
                .transform(new CircleTransform(500,50))
                .into(iv);

    }

    public String getEmoji(int code) {
        String emoji;
        switch (code) {
            case -1:
                emoji = new String(Character.toChars(0x1F44D));
                break;
            case 0:
                emoji = new String(Character.toChars(0x1F44D)) + new String(Character.toChars(0x1F44E));
                break;
            case 1:
                emoji = new String(Character.toChars(0x1F44E));
                break;
            default:
                emoji = new String(Character.toChars(0x2754));
                break;
        }
        return emoji;
    }
}
