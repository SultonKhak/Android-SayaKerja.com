package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_pelamar_sukses extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelamar_sukses);

        Button btnpelamarkembali = (Button) findViewById(R.id.pelamarkembali);
        btnpelamarkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pelamarKembali = new Intent(getApplicationContext(), layout_home_pelamar.class);
                startActivity(pelamarKembali);
            }
        });
    }
}
