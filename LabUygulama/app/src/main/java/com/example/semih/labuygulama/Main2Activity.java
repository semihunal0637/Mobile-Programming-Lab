package com.example.semih.labuygulama;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });
        textView = (TextView)findViewById(R.id.textView);
        //1.Activiteden Gönderilen Veriyi Alma İşlemi
        Bundle alinanMesaj = getIntent().getExtras();
        String deger = alinanMesaj.getString("bilgi");

        if(deger!= null)
        {
            Toast.makeText(getApplicationContext(), "Bilgi Alındı", Toast.LENGTH_SHORT).show();
            textView.setText("Gelen Bilgi : " + deger);
        }
        else{
            Toast.makeText(getApplicationContext(), "Hata", Toast.LENGTH_SHORT).show();

        }

        ImageView resim = (ImageView)findViewById(R.id.imageView);
        resim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.selcuk.edu.tr";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }

}
