package com.example.mechanicalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;

    private Button btnDelete, btnAnswer, btnAngka1, btnAngka2, btnAngka3, btnAngka4,btnAngka5, btnClear,
            btnAngka6, btnAngka7, btnAngka8, btnAngka9, btnAngka0, btnPembagian, btnPengurangan,
            btnPerkalian, btnPertambahan, btnSisaBagi, btnTitik;

    boolean tambah, kurang, bagi, kali, sisaBagi;

    double angka1 = 0, angka2 = 0, hasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        btnDelete = findViewById(R.id.btnDelete);
        btnClear = findViewById(R.id.btnClear);
        btnAnswer = findViewById(R.id.btnAnswer);
        btnAngka1 = findViewById(R.id.btnAngka1);
        btnAngka2 = findViewById(R.id.btnAngka2);
        btnAngka3 = findViewById(R.id.btnAngka3);
        btnAngka4 = findViewById(R.id.btnAngka4);
        btnAngka5 = findViewById(R.id.btnAngka5);
        btnAngka6 = findViewById(R.id.btnAngka6);
        btnAngka7 = findViewById(R.id.btnAngka7);
        btnAngka8 = findViewById(R.id.btnAngka8);
        btnAngka9 = findViewById(R.id.btnAngka9);
        btnAngka0 = findViewById(R.id.btnAngka0);
        btnPembagian = findViewById(R.id.btnPembagian);
        btnPengurangan = findViewById(R.id.btnPengurangan);
        btnPerkalian = findViewById(R.id.btnPerkalian);
        btnPertambahan = findViewById(R.id.btnPertambahan);
        btnSisaBagi = findViewById(R.id.btnSisaBagi);
        btnTitik = findViewById(R.id.btnTitik);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(null);
                angka1 = 0;
                angka2 = 0;
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String backspace = null;
                if (display.getText().length() > 0){
                    StringBuilder stringBuilder = new StringBuilder(display.getText());
                    stringBuilder.deleteCharAt(display.getText().length() - 1);
                    backspace = stringBuilder.toString();
                    display.setText(backspace);
                }
            }
        });

        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tambah) {
                    angka2 = Double.parseDouble(display.getText().toString());
                    hasil = angka1 + angka2;
                    display.setText(Double.toString(hasil));
                    tambah = false;
                }

                if (kurang) {
                    angka2 = Double.parseDouble(display.getText().toString());
                    hasil = angka1 - angka2;
                    display.setText(Double.toString(hasil));
                    kurang = false;
                }

                if (kali) {
                    angka2 = Double.parseDouble(display.getText().toString());
                    hasil = angka1 * angka2;
                    display.setText(Double.toString(hasil));
                    kali = false;
                }

                if (bagi) {
                    angka2 = Double.parseDouble(display.getText().toString());
                    hasil = angka1 / angka2;
                    display.setText(Double.toString(hasil));
                    bagi = false;
                }

                if (sisaBagi) {
                    angka2 = Double.parseDouble(display.getText().toString());
                    hasil = angka1 % angka2;
                    display.setText(Double.toString(hasil));
                    sisaBagi = false;
                }
            }
        });

        btnTitik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append(".");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnAngka0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("0");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnAngka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("1");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnAngka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("2");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnAngka3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("3");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnAngka4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("4");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnAngka5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("5");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnAngka6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("6");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnAngka7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("7");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnAngka8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("8");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnAngka9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("9");
                if(display.getText().length() >= 54){
                    Toast.makeText(getApplicationContext(), "Input yang anda masukkan telah mencapai batas!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnPembagian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display.getText().length() != 0) {
                    angka1 = Double.parseDouble(display.getText().toString());
                    display.setText(null);
                    bagi = true;
                } else {
                    Toast.makeText(getApplicationContext(), "Silakan masukkan angka terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btnPengurangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display.getText().length() != 0) {
                    angka1 = Double.parseDouble(display.getText().toString());
                    display.setText(null);
                    kurang = true;
                } else {
                    Toast.makeText(getApplicationContext(), "Silakan masukkan angka terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnPerkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length() != 0) {
                    angka1 = Double.parseDouble(display.getText().toString());
                    display.setText(null);
                    kali = true;
                } else {
                    Toast.makeText(getApplicationContext(), "Silakan masukkan angka terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSisaBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length() != 0) {
                    angka1 = Double.parseDouble(display.getText().toString());
                    display.setText(null);
                    sisaBagi = true;
                } else {
                    Toast.makeText(getApplicationContext(), "Silakan masukkan angka terlebih dahulu!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        if (savedInstanceState != null) {
            angka1 = savedInstanceState.getDouble("angka1");
            angka2 = savedInstanceState.getDouble("angka2");
            hasil = savedInstanceState.getDouble("hasil");

            tambah = savedInstanceState.getBoolean("tambah");
            kurang = savedInstanceState.getBoolean("kurang");
            kali = savedInstanceState.getBoolean("kali");
            bagi = savedInstanceState.getBoolean("bagi");
            sisaBagi = savedInstanceState.getBoolean("sisaBagi");

            display.setText(savedInstanceState.getString("displayText"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putDouble("angka1", angka1);
        outState.putDouble("angka2", angka2);
        outState.putDouble("hasil", hasil);

        outState.putBoolean("tambah", tambah);
        outState.putBoolean("kurang", kurang);
        outState.putBoolean("kali", kali);
        outState.putBoolean("bagi", bagi);
        outState.putBoolean("sisaBagi", sisaBagi);

        outState.putString("displayText", display.getText().toString());
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}