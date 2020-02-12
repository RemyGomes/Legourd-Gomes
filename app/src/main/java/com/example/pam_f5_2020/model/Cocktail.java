package com.example.pam_f5_2020.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cocktail {

    @SerializedName("idDrink")
    @Expose
    private String idDrink;
    @SerializedName("strDrink")
    @Expose
    private String strDrink;
    @SerializedName("strCategory")
    @Expose
    private String strCategory;
    @SerializedName("strAlcoholic")
    @Expose
    private String strAlcoholic;
    @SerializedName("strGlass")
    @Expose
    private String strGlass;
    @SerializedName("strInstructions")
    @Expose
    private String strInstructions;
    @SerializedName("strDrinkThumb")
    @Expose
    private String strDrinkThumb;
    @SerializedName("strIngredient1")
    @Expose
    private String strIngredient1;
    @SerializedName("strIngredient2")
    @Expose
    private String strIngredient2;
    @SerializedName("strIngredient3")
    @Expose
    private String strIngredient3;
    @SerializedName("strIngredient4")
    @Expose
    private String strIngredient4;
    @SerializedName("strIngredient5")
    @Expose
    private Object strIngredient5;
    @SerializedName("strIngredient6")
    @Expose
    private Object strIngredient6;
    @SerializedName("strIngredient7")
    @Expose
    private Object strIngredient7;
    @SerializedName("strIngredient8")
    @Expose
    private Object strIngredient8;
    @SerializedName("strIngredient9")
    @Expose
    private Object strIngredient9;
    @SerializedName("strIngredient10")
    @Expose
    private Object strIngredient10;
    @SerializedName("strIngredient11")
    @Expose
    private Object strIngredient11;
    @SerializedName("strIngredient12")
    @Expose
    private Object strIngredient12;
    @SerializedName("strIngredient13")
    @Expose
    private Object strIngredient13;
    @SerializedName("strIngredient14")
    @Expose
    private Object strIngredient14;
    @SerializedName("strIngredient15")
    @Expose
    private Object strIngredient15;
    @SerializedName("strMeasure1")
    @Expose
    private String strMeasure1;
    @SerializedName("strMeasure2")
    @Expose
    private String strMeasure2;
    @SerializedName("strMeasure3")
    @Expose
    private String strMeasure3;
    @SerializedName("strMeasure4")
    @Expose
    private String strMeasure4;
    @SerializedName("strMeasure5")
    @Expose
    private Object strMeasure5;
    @SerializedName("strMeasure6")
    @Expose
    private Object strMeasure6;
    @SerializedName("strMeasure7")
    @Expose
    private Object strMeasure7;
    @SerializedName("strMeasure8")
    @Expose
    private Object strMeasure8;
    @SerializedName("strMeasure9")
    @Expose
    private Object strMeasure9;
    @SerializedName("strMeasure10")
    @Expose
    private Object strMeasure10;
    @SerializedName("strMeasure11")
    @Expose
    private Object strMeasure11;
    @SerializedName("strMeasure12")
    @Expose
    private Object strMeasure12;
    @SerializedName("strMeasure13")
    @Expose
    private Object strMeasure13;
    @SerializedName("strMeasure14")
    @Expose
    private Object strMeasure14;
    @SerializedName("strMeasure15")
    @Expose
    private Object strMeasure15;
    @SerializedName("strCreativeCommonsConfirmed")
    @Expose
    private String strCreativeCommonsConfirmed;
    @SerializedName("dateModified")
    @Expose
    private String dateModified;

    @Override
    public String toString() {
        return strDrink + "\n" + strAlcoholic + "\nListe d'ingredients :\n"
                + isNull(strIngredient1) + " " + isNull(strMeasure1) +"\n"
                + isNull(strIngredient2) + " " + isNull(strMeasure2) +"\n"
                + isNull(strIngredient3) + " " + isNull(strMeasure3) +"\n"
                + isNull(strIngredient4) + " " + isNull(strMeasure4) +"\n"
                + isNull(strIngredient5) + " " + isNull(strMeasure5) +"\n"
                +"Instructions : " + strInstructions;
    }

    public String isNull(Object s) {
        if ( s == null)
        {
            return "";
        } else {
            return s.toString();
        }
    }

    public String getIdDrink() {
        return idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    public String getStrIngredient1() {
        return strIngredient1;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }

    public String getStrIngredient4() {
        return strIngredient4;
    }

    public Object getStrIngredient5() {
        return strIngredient5;
    }

    public void setStrIngredient5(Object strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    public Object getStrIngredient6() {
        return strIngredient6;
    }

    public Object getStrIngredient7() {
        return strIngredient7;
    }

    public Object getStrIngredient8() {
        return strIngredient8;
    }

    public Object getStrIngredient9() {
        return strIngredient9;
    }

    public Object getStrIngredient10() {
        return strIngredient10;
    }
    public Object getStrIngredient11() {
        return strIngredient11;
    }

    public Object getStrIngredient12() {
        return strIngredient12;
    }

    public Object getStrIngredient13() {
        return strIngredient13;
    }

    public Object getStrIngredient14() {
        return strIngredient14;
    }

    public Object getStrIngredient15() {
        return strIngredient15;
    }

    public String getStrMeasure1() {
        return strMeasure1;
    }

    public String getStrMeasure2() {
        return strMeasure2;
    }

    public String getStrMeasure3() {
        return strMeasure3;
    }

    public String getStrMeasure4() {
        return strMeasure4;
    }

    public Object getStrMeasure5() {
        return strMeasure5;
    }

    public Object getStrMeasure6() {
        return strMeasure6;
    }

    public Object getStrMeasure7() {
        return strMeasure7;
    }

    public Object getStrMeasure8() {
        return strMeasure8;
    }

    public Object getStrMeasure9() {
        return strMeasure9;
    }

    public Object getStrMeasure10() {
        return strMeasure10;
    }

    public Object getStrMeasure11() {
        return strMeasure11;
    }

    public Object getStrMeasure12() {
        return strMeasure12;
    }

    public Object getStrMeasure13() {
        return strMeasure13;
    }

    public Object getStrMeasure14() {
        return strMeasure14;
    }

    public Object getStrMeasure15() {
        return strMeasure15;
    }

    public String getStrCreativeCommonsConfirmed() {
        return strCreativeCommonsConfirmed;
    }

}
