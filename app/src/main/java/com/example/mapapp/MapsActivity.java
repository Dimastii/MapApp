package com.example.mapapp;


import androidx.fragment.app.FragmentActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private TokenList TokenList = new TokenList();
    String entredKey = "";//хранит введёный текст
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);





        /*final EditText editText = (EditText) findViewById(R.id.text1);
        editText.setOnKeyListener(new View.OnKeyListener() {
                                      public boolean onKey(View v, int keyCode, KeyEvent event) {
                                          if (event.getAction() == KeyEvent.ACTION_DOWN &&
                                                  (keyCode == KeyEvent.KEYCODE_ENTER)) {
                                              // сохраняем текст, введенный до нажатия Enter в переменную
                                              entredKey = editText.getText().toString();
                                              mMap.clear();
                                              addMarkerOnMap(entredKey);
                                              return true;
                                          }
                                          return false;
                                      }
                                  }*/

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        Token q1 = new Token(10,30,"1","Mark #1");
        Token q2 = new Token(30,30,"2","Mark #2");
        Token q3 = new Token(10,10,"3","Mark #3");
        Token q4 = new Token(30,10,"4","Mark #4");
        Token q5 = new Token(54.370807, 48.596662,"5","Mark #5");
        TokenList.add(q1);
        TokenList.add(q2);
        TokenList.add(q3);
        TokenList.add(q4);
        TokenList.add(q5);
        //Перебор всего списка токенов и спавн маркеров
    }

    public void addMarkerOnMap(String key){
       /*
       ЭТОТ КОМЕНТ ТУТ http://developer.alexanderklimov.ru/android/mapintent.php#myModal
       String geoUriString = "geo:0,10?z=2";
        Uri geoUri = Uri.parse(geoUriString);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoUri);
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
        */
        int f = 0;
        for(int i = 0;i < TokenList.Stream.size();i++) {
            f++;
            if (key.equals(TokenList.Stream.get(i).key)) {
                LatLng mark = new LatLng(TokenList.Stream.get(i).v, TokenList.Stream.get(i).v1);
                mMap.addMarker(new MarkerOptions()
                        .position(mark)
                        .title(TokenList.Stream.get(i).title)
                        .snippet("DOP TEXT")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom (mark,10),2000,null);
            }
        }
    }
//Функция обработки щелчка на тестовую кнопку для перехода на новую активити
    public void onClick1(View view) {
        Intent intent = new Intent(MapsActivity.this, InformationAboutMarkActivity.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Пора покормить кота!",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_HORIZONTAL,12,12);
        toast.show();
    }

    public void onClick3(View view) {
        Intent intent = new Intent(MapsActivity.this, JumpPanel.class);
        startActivity(intent);
    }
}
