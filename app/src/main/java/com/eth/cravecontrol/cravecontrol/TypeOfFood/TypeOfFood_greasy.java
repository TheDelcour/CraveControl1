package com.eth.cravecontrol.cravecontrol.TypeOfFood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.eth.cravecontrol.cravecontrol.R;

public class TypeOfFood_greasy extends AppCompatActivity {

    Button pizza;
    Button frenchFries;
    Button nuggets;
    Button kebabMix;
    Button pita;
    private int button_pressed1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_food_greasy);
        pizza = (Button) findViewById(R.id.button_pizza);
        frenchFries = (Button) findViewById(R.id.button_frenchfries);
        nuggets = (Button) findViewById(R.id.button_nuggets);
        kebabMix = (Button) findViewById(R.id.button_kebabmix);
        pita = (Button) findViewById(R.id.button_pita);


        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 1;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_greasy.this, AltScreen.class);
                startActivity(intent);
            }
        });

        frenchFries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 2;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_greasy.this, AltScreen.class);
                startActivity(intent);
            }
        });

        nuggets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 3;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_greasy.this, AltScreen.class);
                startActivity(intent);
            }
        });

        kebabMix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 4;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_greasy.this, AltScreen.class);
                startActivity(intent);
            }
        });

        pita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 5;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_greasy.this, AltScreen.class);
                startActivity(intent);
            }
        });
    }


    public void button_pressedAlt() {
        if(button_pressed1 == 1) {
            AltScreen.setWhat_button_pressed(12);
        }
        if(button_pressed1 == 2) {
            AltScreen.setWhat_button_pressed(13);
        }
        if(button_pressed1 == 3) {
            AltScreen.setWhat_button_pressed(14);
        }
        if(button_pressed1 == 4) {
            AltScreen.setWhat_button_pressed(15);
        }
        if(button_pressed1 == 5) {
            AltScreen.setWhat_button_pressed(16);
        }
    }
}
