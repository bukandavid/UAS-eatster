package com.example.uas_recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecpieActivity extends AppCompatActivity {
    private TextView mNamaResep;
    private TextView mBahanResep;
    private TextView mJudulMetodeResep;
    private TextView mResep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recpie);

        mNamaResep = (TextView) findViewById(R.id.text_resep);
        mBahanResep = (TextView) findViewById(R.id.bahan);
        mJudulMetodeResep = (TextView) findViewById(R.id.metode);
        mResep = (TextView) findViewById(R.id.resep);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("NamaResep");
        String Bahan = intent.getExtras().getString("Bahan");
        String JudulMetode = intent.getExtras().getString("JudulMetodeResep");
        String Resep = intent.getExtras().getString("Resep");

        mNamaResep.setText(Title);
        mBahanResep.setText(Bahan);
        mJudulMetodeResep.setText(JudulMetode);
        mResep.setText(Resep);
    }
}