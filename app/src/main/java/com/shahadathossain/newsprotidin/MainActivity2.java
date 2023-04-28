package com.shahadathossain.newsprotidin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {

   ImageView  ImageMb;
   TextView TvTitle,TvDescription;
   FloatingActionButton Microphone;
   TextToSpeech textToSpeech;

   public static String TITLE = "";
   public static String DESCRIPTION = "";
public static Bitmap MY_BITMAP = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageMb = findViewById(R.id.ImageMb);
        TvTitle = findViewById(R.id.TvTitle);
        TvDescription = findViewById(R.id.TvDescription);
        Microphone = findViewById(R.id.Microphone);


TvTitle.setText(TITLE);
TvDescription.setText(DESCRIPTION);
if (MY_BITMAP!=null) ImageMb.setImageBitmap(MY_BITMAP);

  textToSpeech = new TextToSpeech(MainActivity2.this, new TextToSpeech.OnInitListener() {
      @Override
      public void onInit(int i) {

      }
  });

   Microphone.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {

           String text = TvDescription.getText().toString();
           textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH,null,null);
       }
   });








    }
}