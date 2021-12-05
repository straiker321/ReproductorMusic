package com.example.reprductormusic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class music_view extends Fragment {
    Button next2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.music_view, container, false);
        next2=view.findViewById(R.id.next2);
        next2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ((navigation) getActivity()).navigateTo(new nav_view(),false);
            }
        });

        return view;
    }
}
