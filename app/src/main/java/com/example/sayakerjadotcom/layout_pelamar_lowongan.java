package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_pelamar_lowongan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelamar_lowongan);

        Button btnsalmanfarizi = (Button) findViewById(R.id.salmanfarizi);
        btnsalmanfarizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salmanFarizi = new Intent(getApplicationContext(),layout_detail_pelamar.class);
                startActivity(salmanFarizi);
            }
        });

    }
}
