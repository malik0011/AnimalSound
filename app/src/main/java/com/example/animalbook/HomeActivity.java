package com.example.animalbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    //creating variable and cls
    MediaPlayer player;
    MediaPlayer newPlayer; //media cls for playing sound

    //virtual animal and birds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }

    //function to play sound
    public void Animal(int rid){

        if(newPlayer!=null && newPlayer.isPlaying()){ //if already playing then restart it
            newPlayer.stop();
            //newPlayer.release();
        }

        newPlayer = MediaPlayer.create(this,rid); //creating player object
        newPlayer.start(); //start sound

        newPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                newPlayer.reset(); //if sound complete one phase then just restart it
            }
        });
    }

    //sound of penguin
    public void pngum(View view) {
        Animal(R.raw.p);
    }
    //1.sound of lion
    public void lionSound(View view) {
        Animal(R.raw.li);
    }
    //2.for tiger sound
    public void tiger(View view) {
        Animal(R.raw.tiger);
    }
    //3.for horse sound
    public void horse(View view) {
        Toast.makeText(this, "sound not Avalable!", Toast.LENGTH_SHORT).show();
    }
    //4.for chimpanzee sound
    public void chimpanzee(View view) {
        Animal(R.raw.chimpanse);
    }

    //5.for peacock sound
    public void peacock(View view) {
        Animal(R.raw.peacock);
    }

    //6.for raven sound
    public void raven(View view) {
        Toast.makeText(this, "Sorry, sound is not there!", Toast.LENGTH_SHORT).show();
    }

    //7.sound for crow
    public void crow(View view) {
        Animal(R.raw.crow);
    }

    public void bee(View view) {
        Animal(R.raw.bee);
    }
    //9.sound of cricket
    public void cricket(View view)
    {
        Animal(R.raw.cricket);
    }
                                                         //10.sound of locust
   // int locust =0;
    public void locust(View view)
    {
        Toast.makeText(this, "Music not avalable!", Toast.LENGTH_SHORT).show();
    }
                                                             //11.sound of hornet

    public void hornet(View view)
    {
        Animal(R.raw.hornet);
    }
                                                            //12.sound of grasshoper

    public void grasshopper(View view)
    {
        Animal(R.raw.grashhopper);
    }
                                                            //13.sound of cicada

    public void cicada(View view)
    {
        Animal(R.raw.cicada);
    }


    //previous code
    //        if (i == 0) {
//            pg.setCardElevation(15);
//            pg.setCardBackgroundColor(10000);
//            //just used this fuction to add padding
//            //pg.setPadding(10,10,10,10);
//            if (player == null) {
//                player = MediaPlayer.create(this, R.raw.p); // resource of song
//                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mp) {
//                        if (player != null) {
//                            player.release();
//                            player = null;
//                        }
//                    }
//                });
//            }
//            player.start();
//            i = 1;
//        } else {
//            if (player != null) {
//                pg.setCardElevation(4);
//                pg.setCardBackgroundColor(0);
//                i=0;
//                player.release();
//                player = null;
//                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
//            }
//
//        }

}
