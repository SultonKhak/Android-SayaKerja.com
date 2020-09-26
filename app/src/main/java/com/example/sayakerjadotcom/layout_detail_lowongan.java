package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_detail_lowongan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lowongan);

        Button btnpostlowongan = (Button) findViewById(R.id.postlowongan);
        btnpostlowongan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent postLowongan = new Intent(getApplicationContext(),layout_lowongan_sukses.class);
                startActivity(postLowongan);
            }
        });

    }
}
