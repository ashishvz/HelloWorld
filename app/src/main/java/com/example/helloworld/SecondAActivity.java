package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondAActivity extends AppCompatActivity {
   TextView tx;
   Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tx=findViewById(R.id.textView);
        btn=findViewById(R.id.btn2);

    }

    public void change(View view) {
      TextView tx = findViewById(R.id.textView);
      tx.setText("Hi changed text");
    }
}
