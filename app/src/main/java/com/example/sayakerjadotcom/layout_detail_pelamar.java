package com.example.sayakerjadotcom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class layout_detail_pelamar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pelamar);

        Button btnrekrutpekerja = (Button) findViewById(R.id.rekrutpekerja);
        btnrekrutpekerja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rekrutPekerja = new Intent(getApplicationContext(),layout_notif_rekrut.class);
                startActivity(rekrutPekerja);
            }
        });

    }

}
