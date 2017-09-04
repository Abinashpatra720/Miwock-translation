package com.example.abinashpatra.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaplayer = MediaPlayer.create(this,R.raw.abi);
        Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             mediaplayer.start();
            }
        });
        Button buttoooon =(Button)findViewById(R.id.button2) ;
        buttoooon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             mediaplayer.pause();
            }
        });
        Button buttooon =(Button)findViewById(R.id.button3) ;
        buttooon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaplayer.reset();
            }
        });
    }
}
