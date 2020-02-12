package com.example.pam_f5_2020;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pam_f5_2020.model.Cocktail;

import java.util.ArrayList;

public class CocktailAdapter extends RecyclerView.Adapter<CocktailAdapter.CocktailViewHolder> {

    private ArrayList<Cocktail> drinksName = new ArrayList<Cocktail>();

    public static class CocktailViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        public CocktailViewHolder(LinearLayout v) {
            super(v);
            linearLayout = v;
        }
    }

    public CocktailAdapter(ArrayList<Cocktail> names) {
        drinksName = names;
    }

    public CocktailAdapter.CocktailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.cocktail_layout, parent, false);

        CocktailViewHolder cvh = new CocktailViewHolder(v);
        return cvh;
    }

    @Override
    public void onBindViewHolder(CocktailViewHolder holder, int position) {
        TextView textView = holder.linearLayout.findViewById(R.id.test);
        textView.setText(drinksName.get(position).getStrDrink());
    }

    @Override
    public int getItemCount() {
        return drinksName.size();
    }

}
