package com.eth.cravecontrol.cravecontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TypeOfFood_greasy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_food_greasy);
    }
    public void alternativeScreen(View view) {
        Intent intent = new Intent(TypeOfFood_greasy.this, alternativeScreen.class);
        startActivity(intent);
    }
}