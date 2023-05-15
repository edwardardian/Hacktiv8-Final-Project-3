package com.example.mechanicalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;

    private Button btnDelete, btnAnswer, btnAngka1, btnAngka2, btnAngka3, btnAngka4,btnAngka5,
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

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
                angka1 = 0;
                angka2 = 0;
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


        btnAngka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("1");
            }
        });


        btnAngka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("2");
            }
        });

        btnAngka3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("3");
            }
        });

        btnAngka4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("4");
            }
        });

        btnAngka5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("5");
            }
        });

        btnAngka6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("6");
            }
        });

        btnAngka7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("7");
            }
        });

        btnAngka8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("8");
            }
        });

        btnAngka9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("9");
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
                    Toast.makeText(getApplicationContext(), "Silakan masukkan angka terlebih dahulu!!!", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(), "Silakan masukkan angka terlebih dahulu!!", Toast.LENGTH_SHORT).show();
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