package com.eth.cravecontrol.cravecontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TypeOfFood_other extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_food_other);
    }

    public void alternativeScreen(View view) {
        Intent intent = new Intent(TypeOfFood_other.this, alternativeScreen.class);
        startActivity(intent);
    }
}
