package com.maverickallies.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


//Here implements View.OnClickListener is used to avoid writing the
//OnClickListener again and again for every button.
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button redBtn,greenBtn,pinkBtn,violetBtn,blueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redBtn = findViewById(R.id.btnRedID);
        greenBtn = findViewById(R.id.btnGreenID);
        pinkBtn = findViewById(R.id.btnPinkID);
        violetBtn = findViewById(R.id.btnVioletID);
        blueBtn = findViewById(R.id.btnBlueID);

        redBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        pinkBtn.setOnClickListener(this);
        violetBtn.setOnClickListener(this);
        blueBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int clickedBtnID = v.getId();
        if(clickedBtnID == R.id.btnRedID){
            PlaySounds(R.raw.red);
        }
        else if(clickedBtnID == R.id.btnBlueID){
            PlaySounds(R.raw.blue);
        }
        else if(clickedBtnID == R.id.btnVioletID){
            PlaySounds(R.raw.violet);
        }
        else if(clickedBtnID == R.id.btnPinkID){
            PlaySounds(R.raw.pink);
        }
        else if(clickedBtnID == R.id.btnGreenID){
            PlaySounds(R.raw.green);
        }
    }

    public void PlaySounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),id);
        mediaPlayer.start();
    }

}