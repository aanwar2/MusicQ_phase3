package com.group6.mobileappdev.musicq_phase1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeThumbnailView;

import static com.group6.mobileappdev.musicq_phase1.R.string.*;

public class YoutubePlayer extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_player);
        ImageView imgView = (ImageView) findViewById(R.id.imageView);
        //setPicture(imgView, Uri.parse("https://i.ytimg.com/vi_webp/s_a1hPwXiWw/default.webp"));

        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubeView.initialize(Config.YOUTUBE_API_KEY, this);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    //public void setPicture(ImageView imgView, Uri uri){
//        imgView.setImageURI(uri);

    //  Picasso.with(this).load(uri).into(imgView);
    //}

    public void onInitializationSuccess(Provider provider, final YouTubePlayer player, boolean wasRestored) {

        if (!wasRestored) {
            switch (ViewPlaylistMenu.i) {
                case 1:
                    indiePlaylist(player);
                    break;
                case 2:
                    rockPlaylist(player);
                    break;
                case 3:
                    hiphopPlaylist(player);
                    break;
                case 4:
                    electronicPlaylist(player);
                    break;
                case 5:
                    countryPlaylist(player);
                    break;
                case 6:
                    popPlaylist(player);
                    break;
            }



            Button dislike = (Button) findViewById(R.id.btnDislike);
            dislike.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    player.next();
                }
            });

//          player.cueVideo("u0txgXdtGW5s"); // Plays https://www.youtube.com/watch?v=u0txgXdGW5s
//            player.loadPlaylist("PLSn1U7lJJ1UkPrOvoAb6UVRIbJeygpCma");
        }
    }

    public static void indiePlaylist(YouTubePlayer player) {

        player.loadPlaylist("PLSn1U7lJJ1UkPrOvoAb6UVRIbJeygpCma");
    }

    public static void rockPlaylist(YouTubePlayer player) {

        player.loadPlaylist("PLhd1HyMTk3f5S98HGlByL2eH1T3n6J-bR");
    }

    public static void hiphopPlaylist(YouTubePlayer player) {

        player.loadPlaylist("PLH6pfBXQXHEBElcVFl-gGewA2OaATF4xL");
    }

    public static void electronicPlaylist(YouTubePlayer player) {

        player.loadPlaylist("PLFPg_IUxqnZNTAbUMEZ76_snWd-ED5en7");
    }

    public static void countryPlaylist(YouTubePlayer player) {

        player.loadPlaylist("PLvLX2y1VZ-tHnQyOqyemaWjZjrJYr8ksp");
    }

    public static void popPlaylist(YouTubePlayer player) {

        player.loadPlaylist("PLDcnymzs18LWbmCFUlZie7VsxQ_FIF0_y");
    }



    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize(Config.YOUTUBE_API_KEY, this);
        }
    }

    public void initialize(String developerKey, YouTubeThumbnailView.OnInitializedListener onInitializedlistener) {
    }

    protected Provider getYouTubePlayerProvider() {
        return youTubeView;
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "YoutubePlayer Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.group6.mobileappdev.musicq_phase1/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "YoutubePlayer Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.group6.mobileappdev.musicq_phase1/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
