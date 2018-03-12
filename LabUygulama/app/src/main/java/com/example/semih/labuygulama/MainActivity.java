package com.example.semih.labuygulama;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buton;
    Button GecisButon;
    EditText mesajText;
    String durum="tek";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ConstraintLayout constraintLayout = (ConstraintLayout)findViewById(R.id.Clayout);


        textView = (TextView) findViewById(R.id.text1);
        buton = (Button)findViewById(R.id.button);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(durum=="tek")
                {
                    durum="cift";
                    textView.setText("Şöyle");
                    textView.setTextColor(Color.GREEN);
                    constraintLayout.setBackgroundResource(R.drawable.arka180);
                }
                else
                {
                    durum="tek";
                    textView.setText("Böyle");
                    textView.setTextColor(Color.YELLOW);
                    constraintLayout.setBackgroundResource(R.drawable.arka);
                }
            }
        });

        GecisButon = (Button) findViewById(R.id.button2);
        GecisButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesajText = (EditText)findViewById(R.id.editText);
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("bilgi",mesajText.getText().toString()); //Veri Gönderme İşlemi
                startActivity(intent);
            }
        });



    }

}
