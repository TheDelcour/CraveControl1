package com.eth.cravecontrol.cravecontrol.TypeOfFood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.eth.cravecontrol.cravecontrol.R;

public class TypeOfFood_other extends AppCompatActivity {

    Button umami;
    Button bitter;
    private int button_pressed1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_food_other);
        umami = (Button) findViewById(R.id.button_umami);
        bitter = (Button) findViewById(R.id.button_bitter);


        umami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 1;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_other.this, AltScreen.class);
                startActivity(intent);
            }
        });

        bitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 2;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_other.this, AltScreen.class);
                startActivity(intent);
            }
        });
    }

    public void button_pressedAlt() {
        if (button_pressed1 == 1) {
            AltScreen.setWhat_button_pressed(8);
        }
        if (button_pressed1 == 2) {
            AltScreen.setWhat_button_pressed(9);
        }
    }
}
