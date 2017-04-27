package com.eth.cravecontrol.cravecontrol.TypeOfFood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.eth.cravecontrol.cravecontrol.R;

public class TypeOfFood_sour extends AppCompatActivity {

    Button sourCandy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_food_sour);
        sourCandy = (Button) findViewById(R.id.button_sourcandy);


        sourCandy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_sour.this, AltScreen.class);
                startActivity(intent);
            }
        });
    }

    public void button_pressedAlt() {
            AltScreen.setWhat_button_pressed(7);
    }
}
