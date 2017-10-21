package com.a1694676example.sakshi.shoppingsite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class detail_Activity extends AppCompatActivity {
    Button btn;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_);
        img1 = (ImageView) findViewById(R.id.img1);
    }

    public void buythis(View v) {
        Toast.makeText(detail_Activity.this, "image clicked ", Toast.LENGTH_LONG).show();
       // Intent i = getIntent();

       // startActivity(i);
      //  finish();
    }
}
