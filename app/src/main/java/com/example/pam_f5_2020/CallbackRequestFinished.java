package com.example.pam_f5_2020;

import com.example.pam_f5_2020.model.CocktailResponse;

public interface CallbackRequestFinished {

    void onFinish(CocktailResponse cocktails);
}
