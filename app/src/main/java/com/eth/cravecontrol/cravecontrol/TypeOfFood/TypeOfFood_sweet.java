package com.eth.cravecontrol.cravecontrol.TypeOfFood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.eth.cravecontrol.cravecontrol.R;

public class TypeOfFood_sweet extends AppCompatActivity {

    Button cake;
    Button softDrink;
    Button iceCream;
    Button caramel;
    Button chocolate;
    Button candy;
    private int button_pressed1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_type_of_food_sweet);
        cake = (Button) findViewById(R.id.button_cake);
        softDrink = (Button) findViewById(R.id.button_soft);
        iceCream = (Button) findViewById(R.id.button_ice);
        caramel = (Button) findViewById(R.id.button_caramel);
        chocolate = (Button) findViewById(R.id.button_choco);
        candy = (Button) findViewById(R.id.button_candy);


        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 1;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_sweet.this, AltScreen.class);
                startActivity(intent);
            }
        });

        softDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 2;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_sweet.this, AltScreen.class);
                startActivity(intent);
            }
        });

        iceCream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 3;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_sweet.this, AltScreen.class);
                startActivity(intent);
            }
        });

        caramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 4;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_sweet.this, AltScreen.class);
                startActivity(intent);
            }
        });

        chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 5;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_sweet.this, AltScreen.class);
                startActivity(intent);
            }
        });

        candy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_pressed1 = 6;
                button_pressedAlt();
                Intent intent = new Intent(TypeOfFood_sweet.this, AltScreen.class);
                startActivity(intent);
            }
        });
        }



    public void button_pressedAlt() {
        if(button_pressed1 == 1) {
            AltScreen.setWhat_button_pressed(1);
        }
        if(button_pressed1 == 2) {
            AltScreen.setWhat_button_pressed(2);
        }
        if(button_pressed1 == 3) {
            AltScreen.setWhat_button_pressed(3);
        }
        if(button_pressed1 == 4) {
            AltScreen.setWhat_button_pressed(4);
        }
        if(button_pressed1 == 5) {
            AltScreen.setWhat_button_pressed(5);
        }
        if(button_pressed1 == 6) {
            AltScreen.setWhat_button_pressed(6);
        }
    }

}
