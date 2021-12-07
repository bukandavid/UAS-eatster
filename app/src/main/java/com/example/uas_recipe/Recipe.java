package com.example.uas_recipe;

public class Recipe {
    private String NamaResep;
    private String BahanResep;
    private String JudulMetodeResep;
    private String Resep;
    private int Thumbnail;

    public Recipe (String name, String bahanResep, String judulMetodeResep, String resep, int thumbnail){
        NamaResep = name;
        BahanResep = bahanResep;
        JudulMetodeResep = judulMetodeResep;
        Resep = resep;
        Thumbnail = thumbnail;
    }

    public String getNamaResep(){
        return NamaResep;
    }

    public String getBahanResep(){
        return BahanResep;
    }

    public String getJudulMetodeResep(){
        return JudulMetodeResep;
    }

    public String getResep(){
        return Resep;
    }

    public int getThumbnail(){
        return Thumbnail;
    }



}
