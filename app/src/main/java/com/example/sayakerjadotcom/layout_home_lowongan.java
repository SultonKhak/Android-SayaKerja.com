package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_home_lowongan extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_lowongan);

        Button btntambahlowongan = (Button) findViewById(R.id.tambahlowongan);
        btntambahlowongan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tambahLowongan = new Intent(getApplicationContext(),layout_detail_lowongan.class);
                startActivity(tambahLowongan);
            }
        });

        Button btndaftarpelamar = (Button) findViewById(R.id.daftarpelamar);
        btndaftarpelamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftarPelamar = new Intent(getApplicationContext(),layout_pelamar_lowongan.class);
                startActivity(daftarPelamar);
            }
        });

        Button btnpilihanakun = (Button) findViewById(R.id.pilihanakun);
        btnpilihanakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pilihanAkun = new Intent(getApplicationContext(),layout_pilih.class);
                startActivity(pilihanAkun);
            }
        });


    }
}
