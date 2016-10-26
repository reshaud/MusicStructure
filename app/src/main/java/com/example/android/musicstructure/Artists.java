package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        //Go to Songs activity
        ImageView artistA = (ImageView) findViewById(R.id.artistA);
        artistA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Songs.class);
                startActivity(i);
            }
        });

        //Go to Songs activity
        ImageView artistB = (ImageView) findViewById(R.id.artistB);
        artistB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Songs.class);
                startActivity(i);
            }
        });

        ImageView artistC = (ImageView) findViewById(R.id.artistC);
        artistC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Songs.class);
                startActivity(i);
            }
        });
    }
}
