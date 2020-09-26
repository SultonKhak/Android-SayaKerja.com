package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_pilih extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan);

        Button btnpilberkerja = (Button) findViewById(R.id.pilberkerja);
        btnpilberkerja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(getApplicationContext(),layout_biodata.class);
                startActivity(i4);
            }
        });

        Button btnpillowngan = (Button) findViewById(R.id.pillowongan);
        btnpillowngan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pilLowongan = new Intent(getApplicationContext(), layout_home_lowongan.class);
                startActivity(pilLowongan);
            }
        });

    }
}
