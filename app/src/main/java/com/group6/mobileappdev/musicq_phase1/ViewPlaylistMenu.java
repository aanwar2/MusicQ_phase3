package com.group6.mobileappdev.musicq_phase1;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ViewPlaylistMenu extends AppCompatActivity  {
    public static int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_playlist_menu);
        ImageButton indieBtn = (ImageButton)findViewById(R.id.indie);
        indieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=1;
                startActivity(new Intent(ViewPlaylistMenu.this, YoutubePlayer.class));
            }
        });
        ImageButton hiphopBtn = (ImageButton)findViewById(R.id.hiphop);
        hiphopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=2;
                startActivity(new Intent(ViewPlaylistMenu.this, YoutubePlayer.class));
            }
        });
        ImageButton rockBtn = (ImageButton)findViewById(R.id.rock);
        rockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=3;
                startActivity(new Intent(ViewPlaylistMenu.this, YoutubePlayer.class));
            }
        });
        ImageButton edmBtn = (ImageButton)findViewById(R.id.electronic);
        edmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=4;
                startActivity(new Intent(ViewPlaylistMenu.this, YoutubePlayer.class));
            }
        });
        ImageButton countryBtn = (ImageButton)findViewById(R.id.country);
        countryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=5;
                startActivity(new Intent(ViewPlaylistMenu.this, YoutubePlayer.class));
            }
        });
        ImageButton popBtn = (ImageButton)findViewById(R.id.pop);
        popBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=6;
                startActivity(new Intent(ViewPlaylistMenu.this, YoutubePlayer.class));
            }
        });


    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_view_playlist_menu);
//
//        ImageView btn = (ImageView)findViewById(R.id.imageViewRave);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(ViewPlaylistMenu.this, YoutubePlayer.class));
//            }
//        });
//    }
}
