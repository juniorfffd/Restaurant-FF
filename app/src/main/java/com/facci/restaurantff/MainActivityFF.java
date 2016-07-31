package com.facci.restaurantff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityFF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_ff);
    }

    public void click1(View v){
        Toast.makeText(MainActivityFF.this,"Comida de la Casa",Toast.LENGTH_SHORT).show();
    }

    public void click2(View v){
        Toast.makeText(MainActivityFF.this,"Caldo de Albondiga",Toast.LENGTH_SHORT).show();
    }

    public void click3(View v){
        Toast.makeText(MainActivityFF.this,"Casuela de Mariscos",Toast.LENGTH_SHORT).show();
    }

    public void click4(View v){
        Toast.makeText(MainActivityFF.this,"Encebollado",Toast.LENGTH_SHORT).show();
    }

    public void click5(View v){
        Toast.makeText(MainActivityFF.this,"Ceviche Mixto",Toast.LENGTH_SHORT).show();
    }

    public void click6(View v){
        Toast.makeText(MainActivityFF.this,"Sancocho de Pescado",Toast.LENGTH_SHORT).show();
    }

    public void click7(View v){
        Toast.makeText(MainActivityFF.this,"Seco de Chivo",Toast.LENGTH_SHORT).show();
    }
}
