package com.example.reprductormusic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;



public class nav_view extends Fragment {
    Button play_pause, btn_repetir;
    MediaPlayer mp;
    ImageView iv;
    int repetir = 2, posicion = 0;

    MediaPlayer vectormp [] = new MediaPlayer[1];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.nav_view, container, false);
        play_pause =(Button) view.findViewById(R.id.button_play);
        btn_repetir=(Button) view.findViewById(R.id.button_repetir);
        iv = (ImageView) view.findViewById(R.id.imageView2);

        //vectormp[0] = MediaPlayer.create(this, R.raw.the_pretender);

        return view;
    }
}