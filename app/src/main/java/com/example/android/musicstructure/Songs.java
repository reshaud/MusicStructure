package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        //Go to Now Playing
        TextView dummyA = (TextView) findViewById(R.id.dummySongA);
        dummyA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), NowPlaying.class);
                startActivity(i);
            }
        });

        TextView dummyB = (TextView) findViewById(R.id.dummySongB);
        dummyB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), NowPlaying.class);
                startActivity(i);
            }
        });

        TextView dummyC = (TextView) findViewById(R.id.dummySongC);
        dummyC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), NowPlaying.class);
                startActivity(i);
            }
        });

        TextView dummyD = (TextView) findViewById(R.id.dummySongD);
        dummyD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), NowPlaying.class);
                startActivity(i);
            }
        });
    }
}
