package com.a1694676example.sakshi.shoppingsite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn_trade,btn_sell,btn_buy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_trade = (Button) findViewById(R.id.btn_trade);

        btn_trade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Shop_clothes.class);
                startActivity(i);
            }
        });
    }
    public void btn_buy(View view){

        Toast.makeText(MainActivity.this,"Button buy clicked ",Toast.LENGTH_LONG).show();
        Intent i=new Intent(MainActivity.this,BuyActivity.class);
        startActivity(i);
    }
    public void buttonSell(View view){

        Toast.makeText(MainActivity.this,"Button sell clicked ",Toast.LENGTH_LONG).show();
        Intent i=new Intent(MainActivity.this,SaleActivity.class);
        startActivity(i);
    }
}
