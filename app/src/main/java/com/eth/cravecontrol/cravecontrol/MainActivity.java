package com.eth.cravecontrol.cravecontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void taste_sweet(View view) {
        Intent intent = new Intent(MainActivity.this, TypeOfFood_sweet.class);
        startActivity(intent);
    }

    public void taste_salty(View view) {
        Intent intent = new Intent(MainActivity.this, TypeOfFood_salty.class);
        startActivity(intent);
    }
    public void taste_sour(View view) {
        Intent intent = new Intent(MainActivity.this, TypeOfFood_sour.class);
        startActivity(intent);
    }
    public void taste_greasy(View view) {
        Intent intent = new Intent(MainActivity.this, TypeOfFood_greasy.class);
        startActivity(intent);
    }

    public void taste_other(View view) {
        Intent intent = new Intent(MainActivity.this, TypeOfFood_other.class);
        startActivity(intent);
    }

}
