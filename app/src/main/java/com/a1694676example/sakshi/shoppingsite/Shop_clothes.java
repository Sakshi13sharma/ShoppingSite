package com.a1694676example.sakshi.shoppingsite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Shop_clothes extends AppCompatActivity {

    ArrayList<Clothes> arraycls;

    ListView lstv;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("clothes");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_clothes);

        lstv =  (ListView)findViewById(R.id.listOfClothes);

        arraycls =  new ArrayList<>();

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(DataSnapshot ds : dataSnapshot.getChildren())
                {
                    String url = ds.child("Url").getValue().toString();

                    String nm = ds.child("Name").getValue().toString();


                    arraycls.add(new Clothes(url,nm));
                }

                AdapterClothes adapter = new AdapterClothes(arraycls,Shop_clothes.this);

                lstv.setAdapter(adapter);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }


        });


    }
}
