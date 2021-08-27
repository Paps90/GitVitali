package com.example.myapplication;


import static java.sql.DriverManager.println;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.Random;
import java.util.List;


public class MainActivity extends Activity {

    private TextView mTextView;
    //private ActivityMainBinding binding;
    private Button pulsante;
    private final List<String> informazioni = Arrays.asList("id", "azione", "descrizione"); // Lista prova

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pulsante = (Button) findViewById(R.id.pulsante);
        mTextView = (TextView) findViewById(R.id.testo);

        WifiManager manager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        WifiInfo info = manager.getConnectionInfo();
        
        String address = "Id ospite \n" + info.getMacAddress();
        mTextView.setText(address);


        pulsante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // azione da compiere quando clicco sul Button

            }
        });




        //setAmbientEnabled();
    }
}




