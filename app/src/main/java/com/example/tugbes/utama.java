package com.example.tugbes;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class utama extends AppCompatActivity {

    Button button6, button7, button8, button10, button11, button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);
        

        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent i = new Intent (utama.this, home.class);
                startActivity(i);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent i = new Intent (utama.this, voucher.class);
                startActivity(i);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent i = new Intent (utama.this, rekomendasi.class);
                startActivity(i);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent i = new Intent (utama.this, Hemat.class);
                startActivity(i);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent i = new Intent (utama.this, promo.class);
                startActivity(i);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent i = new Intent (utama.this, pembayaran.class);
                startActivity(i);
            }
        });
    }
}
