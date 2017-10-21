package com.a1694676example.sakshi.shoppingsite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class BuyActivity extends AppCompatActivity {

    ImageView img1, img2, img3, img4, img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);
    }


    public void onimg1(View v) {
        Toast.makeText(BuyActivity.this, "image clicked", Toast.LENGTH_LONG).show();
        Intent i = new Intent(BuyActivity.this, detail_Activity.class);
       // ImageView editText = (ImageView) findViewById(R.id.img1);
        //String message = editText.getDrawable().toString();
       // i.putExtra("hello", message);
        startActivity(i);

    }

    public void onimg2(View v) {
        Toast.makeText(BuyActivity.this, "image clicked ", Toast.LENGTH_LONG).show();
        Intent i = new Intent(BuyActivity.this, detail_Activity.class);
        startActivity(i);
    }

    public void onimg3(View v) {
        Toast.makeText(BuyActivity.this, "image clicked", Toast.LENGTH_LONG).show();
        Intent i = new Intent(BuyActivity.this, detail_Activity.class);
        startActivity(i);
    }

    public void onimg4(View v) {
        Toast.makeText(BuyActivity.this, "image clicked", Toast.LENGTH_LONG).show();
        Intent i = new Intent(BuyActivity.this, detail_Activity.class);
        startActivity(i);

    }

    public void onimg5(View v) {
        Toast.makeText(BuyActivity.this, "image clicked", Toast.LENGTH_LONG).show();
        Intent i = new Intent(BuyActivity.this, detail_Activity.class);
        startActivity(i);

    }
}