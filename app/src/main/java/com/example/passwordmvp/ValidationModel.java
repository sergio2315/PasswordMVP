package com.example.passwordmvp;

public class ValidationModel {
    private int min;
    private int mediun;
    private int max;
    private String color;
    private String textColor;

    public String getTextColor() {
        return textColor;
    }

    public String validateSegurity(String value){
        if (value.length()<5){
            textColor="debil";
           return "#FF0000";
        }
        if (value.length()>5){
            if (value.equals(value.toLowerCase())){
                textColor="medio";
                return "#FFFF00";
            }else {
                textColor="fuerte";
                return "#FFFF00";
            }
        }
        else {
            return "";
        }
    }
}
