package com.example.animalbook;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    MediaPlayer player;
    //virtual animal and birds
    int i = 0;
    int j = 0;
    int tiger =0;
    int chimp =0;
    int peco = 0;
    int raven =0;
    int crow =0;
    int bee =0;
    int cricket =0;
    int locust =0;
    int hornet =0;
    int grasshopper =0;
    int cicada =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
       // pgu = findViewById(R.id.penguin);


    }


    //sound of penguin
    public void pngum(View view) {
        if (i == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.p); // resource of song
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
            player.start();
            i = 1;
        } else {
            if (player != null) {
                i=0;
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }

        }
    }

                                                    //1.sound of lion

    public void lionSound(View view) {
        if (j == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.li);
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
            player.start();
            j = 1;
        } else {
            if (player != null) {
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }
        }
    }
                                                    //2.for tiger sound

    public void tiger(View view) {
        if (tiger == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.tiger); // resource of song
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
            player.start();
            tiger = 1;
        } else {
            if (player != null) {
                tiger=0;
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }

        }
    }
                                                     //3.for horse sound
    public void horse(View view) {
        Toast.makeText(this, "sound not Avalable!", Toast.LENGTH_SHORT).show();
    }
                                                     //4.for chimpanzee sound
     //chimp == chimpsnzee
    public void chimpanzee(View view) {
        if (chimp == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.chimpanse); // resource of song
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
            player.start();
            chimp = 1;
        } else {
            if (player != null) {
                chimp=0;
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }

        }

    }

                                                    //5.for peacock sound
    //int peco = 0; // peco==peacock
    public void peacock(View view) {
        if (peco == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.peacock); // resource of song
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
            player.start();
            peco = 1;
        } else {
            if (player != null) {
                peco=0;
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }

        }
    }

                                                    //6.for raven sound

    public void raven(View view) {
        Toast.makeText(this, "Sorry, sound is not there!", Toast.LENGTH_SHORT).show();
    }

                                                     //7.sound for crow

    public void crow(View view) {
        if (crow == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.crow); // resource of song
//                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                    @Override
//                    public void onCompletion(MediaPlayer mp) {
//                        if (player != null) {
//                            player.release();
//                            player = null;
//                            crow = 1;
//                            Toast.makeText(HomeActivity.this, "Completed", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
            }
            player.start();
            crow = 1;
        } else {
            if (player != null) {
                crow=0;
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }

        }
    }

                                                         //8.sound of bee

    public void bee(View view)
    {
        if (bee == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.bee); // resource of song
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
            player.start();
            bee = 1;
        } else {
            if (player != null) {
                bee=0;
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }

        }

    }

                                                         //9.sound of cricket

    public void cricket(View view)
    {
        if (cricket == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.cricket); // resource of song
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
            player.start();
            cricket = 1;
        } else {
            if (player != null) {
                cricket=0;
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }

        }

    }
                                                         //10.sound of locust
   // int locust =0;
    public void locust(View view)
    {
//        if (locust == 0) {
//            if (player == null) {
//                player = MediaPlayer.create(this, R.raw.); // resource of song
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
//            locust = 1;
//        } else {
//            if (player != null) {
//                locust=0;
//                player.release();
//                player = null;
//                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
//            }
//
//        }
        Toast.makeText(this, "Music not avalable!", Toast.LENGTH_SHORT).show();

    }
                                                             //11.sound of hornet

    public void hornet(View view)
    {
        if (hornet == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.hornet); // resource of song
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
            player.start();
            hornet = 1;
        } else {
            if (player != null) {
                hornet=0;
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }

        }
    }
                                                            //12.sound of grasshoper

    public void grasshopper(View view)
    {
        if (grasshopper == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.grashhopper); // resource of song
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
            player.start();
            grasshopper = 1;
        } else {
            if (player != null) {
                grasshopper=0;
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }

        }
    }
                                                            //13.sound of cicada

    public void cicada(View view)
    {
        if (cicada == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.cicada); // resource of song
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
            player.start();
            cicada = 1;
        } else {
            if (player != null) {
                cicada=0;
                player.release();
                player = null;
                Toast.makeText(this, "Music Stoped!", Toast.LENGTH_SHORT).show();
            }

        }

    }
}
