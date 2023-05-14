package com.example.mechanicalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Button btnDelete, btnAnswer, btnAngka1, btnAngka2, btnAngka3, btnAngka4,btnAngka5,
            btnAngka6, btnAngka7, btnAngka8, btnAngka9, btnAngka0, btnPembagian, btnPengurangan,
            btnPerkalian, btnPertambahan, btnPersen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}