package com.a1694676example.sakshi.shoppingsite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class SaleActivity extends AppCompatActivity {

    EditText title,price,link;
    Button sell,search;
    Spinner size;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);
        title=(EditText)findViewById(R.id.title);
        link=(EditText)findViewById(R.id.link);
        price=(EditText)findViewById(R.id.price);
        sell=(Button)findViewById(R.id.sell);
        search=(Button)findViewById(R.id.search);
        size=(Spinner)findViewById(R.id.drop_down);
        image=(ImageView)findViewById(R.id.image_View);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(SaleActivity.this).load(link.getText().toString()).into(image);

                Toast.makeText(SaleActivity.this,"Item is searched",Toast.LENGTH_LONG).show();
            }
        });


        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SaleActivity.this,"Item is sold",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
