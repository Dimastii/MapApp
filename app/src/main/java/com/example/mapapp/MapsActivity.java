package com.example.mapapp;


import android.os.Bundle;
import android.widget.ImageView;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import java.util.LinkedList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        RecyclerView recyclerView = findViewById(R.id.activity_maps__items_in_slide_pannel);
        MarkAdapter markAdapter = new MarkAdapter(generateMarkList());
        recyclerView.setAdapter(markAdapter);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(MapsActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);


    }

    private List<Token> generateMarkList() {
        LinkedList<Token> TokenList = new LinkedList<>();
        LinkedList<Integer> imageList = new LinkedList<Integer>();


        imageList.add(R.drawable.love_fonk);
        imageList.add(R.drawable.love_fonk);
        imageList.add(R.drawable.love_fonk);

        Token q1 = new Token(10,30,"1","Mark #1",imageList);
        Token q2 = new Token(30,30,"2","Mark #2",imageList);
        Token q3 = new Token(10,10,"3","Mark #3",imageList);
        Token q4 = new Token(30,10,"4","Mark #4",imageList);
        Token q5 = new Token(54.370807, 48.596662,"5","Mark #5",imageList);
        TokenList.add(q1);
        TokenList.add(q2);
        TokenList.add(q3);
        TokenList.add(q4);
        TokenList.add(q5);
        return TokenList;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }


}
