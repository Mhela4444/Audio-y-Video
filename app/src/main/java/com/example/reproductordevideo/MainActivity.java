package com.example.reproductordevideo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView VideoView;
    Button btnPlay;
    Button btnPausa;

    Button audio;

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView = (VideoView) findViewById(R.id.video1);
        btnPlay = findViewById(R.id.btnPlay);
        btnPausa = findViewById(R.id.btnPausa);
        audio = (Button) findViewById(R.id.audio);
        mp = MediaPlayer.create(this, R.raw.himnos);

        VideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video));


        btnPlay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView.start();
            }

        });
        btnPausa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VideoView.pause();
            }

        });

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.pause();
                    audio.setBackgroundResource(R.drawable.tocar);
                    Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();

                } else {
                    mp.start();
                    audio.setBackgroundResource(R.drawable.pausa);
                    Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
