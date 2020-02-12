package com.example.pam_f5_2020;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pam_f5_2020.model.Cocktail;

import static android.nfc.NfcAdapter.EXTRA_DATA;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cocktail_detail_layout);
        TextView tv = findViewById(R.id.detail);

        Intent startingIntent = getIntent();
        Cocktail cocktail = (Cocktail) startingIntent.getSerializableExtra(EXTRA_DATA);

        tv.setText(cocktail.toString());

    }
}
