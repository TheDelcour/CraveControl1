package com.eth.cravecontrol.cravecontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TypeOfFood_salty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_food_salty);
    }

    public void alternativeScreen(View view) {
        Intent intent = new Intent(TypeOfFood_salty.this, alternativeScreen.class);
        startActivity(intent);
    }
}
