package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ImageView albumA = (ImageView) findViewById(R.id.albumA);
        albumA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Songs.class);
                startActivity(i);
            }
        });

        ImageView albumB = (ImageView) findViewById(R.id.albumB);
        albumB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Songs.class);
                startActivity(i);
            }
        });

        ImageView albumC = (ImageView) findViewById(R.id.albumC);
        albumC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Songs.class);
                startActivity(i);
            }
        });
    }
}
