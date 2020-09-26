package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_notif_rekrut extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif_rekrut);

        Button btnrekrutkembali = (Button) findViewById(R.id.rekrutkembali);
        btnrekrutkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rekrutKembali = new Intent(getApplicationContext(), layout_home_lowongan.class);
                startActivity(rekrutKembali);
            }
        });
    }
}
