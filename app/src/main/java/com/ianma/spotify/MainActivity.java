package com.ianma.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView btn_back_music, btn_next_music,btn_play_music,thumbMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_back_music = findViewById(R.id.btn_back_music);
        btn_next_music = findViewById(R.id.btn_next_music);
        btn_play_music = findViewById(R.id.btn_play_music);

        thumbMusic = findViewById(R.id.thumbMusic);

        Glide.with(getApplicationContext()).load("https://img.youtube.com/vi/7dKdvqmR8FA/hqdefault.jpg").into(thumbMusic);

        btn_next_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_play_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_back_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}