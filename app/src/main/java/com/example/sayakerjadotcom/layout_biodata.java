package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_biodata extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        Button btndaftarbiodata = (Button) findViewById(R.id.daftarhome);
        btndaftarbiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftarbiodata = new Intent(getApplicationContext(),layout_home_pelamar.class);
                startActivity(daftarbiodata);
            }
        });

    }
}
