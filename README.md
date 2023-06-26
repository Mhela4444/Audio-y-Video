# Audio-y-Video


El reproductor de video y audio proporciona una interfaz y un conjunto de funciones que permiten  reproducir, pausar el video 

Codigo de la interfaz

<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#E6B1A0"
    tools:context=".MainActivity">

    <VideoView
        android:id="@+id/video1"
        android:layout_width="347dp"
        android:layout_height="287dp"
        android:layout_marginTop="148dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/btnPlay"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Play"
        android:textAlignment="center"
        android:textSize="20sp"
        android:textStyle="bold|italic"
        app:iconTint="#B65959"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/btnPausa"
        app:layout_constraintHorizontal_bias="0.863"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.096" />

    <Button
        android:id="@+id/btnPausa"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Pause"
        android:textColorHighlight="#9C27B0"
        android:textColorHint="#9C27B0"
        android:textColorLink="#FFEB3B"
        android:textSize="20sp"
        android:textStyle="bold|italic"
        app:iconTint="#E8DFDE"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.642"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.096" />

    <Button
        android:id="@+id/audio"
        android:layout_width="72dp"
        android:layout_height="76dp"
        android:layout_marginBottom="40dp"
        android:background="@drawable/tocar"
        android:textColorHighlight="#090808"
        android:textColorLink="#0B0A0A"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.448"
        app:layout_constraintStart_toStartOf="parent" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="169dp"
        android:layout_height="97dp"
        android:layout_marginBottom="36dp"
        app:layout_constraintBottom_toTopOf="@+id/audio"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.45"
        app:layout_constraintStart_toStartOf="parent"
        app:srcCompat="@drawable/sonido" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="220dp"
        android:text="Reproductor de sonido"
        android:textSize="20sp"
        android:textStyle="bold|italic"
        app:layout_constraintBottom_toBottomOf="@+id/audio"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.45"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:text="Reproductor de Video"
        android:textSize="20sp"
        android:textStyle="bold|italic"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>


Codigo Java

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


![image](https://github.com/Mhela4444/Audio-y-Video/assets/133244582/ff60bb17-52c3-41b7-9dc6-7616962b3b97)

Resultado

![image](https://github.com/Mhela4444/Audio-y-Video/assets/133244582/f933ab6f-00a8-45ec-adf7-31f4aaf55e4f)
![WhatsApp Image 2023-06-25 at 23 12 59 (1)](https://github.com/Mhela4444/Audio-y-Video/assets/133244582/7275b55a-e2db-4c3a-8604-24178cfd268d)





