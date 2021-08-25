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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
       // pgu = findViewById(R.id.penguin);

    }

    int i = 0;
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

    //sound of lion
    int j = 0;
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
    //for tiger sound
    int tiger =0;
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
    //for horse sound
    public void horse(View view) {
        Toast.makeText(this, "sound not Avalable!", Toast.LENGTH_SHORT).show();
    }
    //for chimpanzee sound
    int chimp =0; //chimp == chimpsnzee
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

    //for peacock sound
    int peco = 0; // peco==peacock
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

    //for raven sound
    int raven =0;
    public void raven(View view) {
        Toast.makeText(this, "Sorry, sound is not there!", Toast.LENGTH_SHORT).show();
    }

    //sound for crow
    int crow =0;
    public void crow(View view) {
        if (crow == 0) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.crow); // resource of song
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
}
