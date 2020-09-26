package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_lowongan_sukses extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowongan_sukses);

        Button btnlowongankembali = (Button) findViewById(R.id.lowongankembali);
        btnlowongankembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lowonganKembali = new Intent(getApplicationContext(), layout_home_lowongan.class);
                startActivity(lowonganKembali);
            }
        });
    }
}
