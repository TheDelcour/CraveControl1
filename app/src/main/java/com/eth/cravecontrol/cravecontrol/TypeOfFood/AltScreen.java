package com.eth.cravecontrol.cravecontrol.TypeOfFood;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.eth.cravecontrol.cravecontrol.MainActivity;
import com.eth.cravecontrol.cravecontrol.R;
import com.eth.cravecontrol.cravecontrol.databinding.ActivityAltScreenBinding;

public class AltScreen extends AppCompatActivity {

    private static int what_button_pressed = 0;

    private ActivityAltScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_alt_screen);

        // the what_button_pressed variable goes from 1-16. Look up the different taste classes to see which variable number belongs to which food and create if statemtent like the ones below
        // where you filled the nutrition info for the food into the constructor as shown in the first if statement.
        // 1-6 are inside the sweet class, 7 is inside the sour class, 8 & 9 inside the other class, 10 & 11 inside the salty class and last 12-16 inside the greasy class.

        // the constructor used:
        // public AltScreenVariables(String calories, String carbs, String carbsSugar, String fat, String energy, String info, String type, String typeAlt, String infoAlt, String caloriesAlt, String carbsAlt, String carbsSugarAlt, String fatAlt, String energyAlt)

        if(what_button_pressed ==1){
            AltScreenVariables altScreenVariables = new AltScreenVariables(" 432 kcal", " 50,6 g", " 49,3 g", " 23,5 g", " 1808 kJ", "The nutrition info shown is for a normal chocolate cake!", " Cake", " Fruit & yogurt", "It would be much healthier to eat fruit and yogurt instead!", " 87 kcal", " 12,3 g", " 11,3 g", " 3,2 g", " 362 kJ");
            binding.setAltScreenVariables(altScreenVariables);
        }
        if(what_button_pressed ==2){
            AltScreenVariables altScreenVariables = new AltScreenVariables(" 100", " 100", " 123", " 323", " 123", "This is Sweet!", "  Cake", "Apple", "This is even more sweet!", "1233", "23213", "23213", "12312", "2131");
            //change the constructor above for this one and the one below, create the rest yourself
            binding.setAltScreenVariables(altScreenVariables);
        }
        if(what_button_pressed ==3){
            AltScreenVariables altScreenVariables = new AltScreenVariables(" 100", " 100", " 123", " 323", " 123", "This is Sweet!", "  Cake", "Apple", "This is even more sweet!", "1233", "23213", "23213", "12312", "2131");
            binding.setAltScreenVariables(altScreenVariables);
        }
    }

    private void button_pressed(){

    }

    public static int getWhat_button_pressed() {
        return what_button_pressed;
    }

    public static void setWhat_button_pressed(int button_pressed1) {
        what_button_pressed = button_pressed1;
    }

    public void onClickYesNo(View view) {
        Button button_yes = (Button) findViewById(R.id.button_yes);
        Button button_no = (Button) findViewById(R.id.button_no);
        MainActivity progress = new MainActivity();
    if(view.getId() == button_yes.getId()){
        Intent intent = new Intent(AltScreen.this, MainActivity.class);
        progress.setProgressStatus(+10);
        finish();
        startActivity(intent);
    }
    else if(view.getId() == button_no.getId()){
        Intent intent = new Intent(AltScreen.this, MainActivity.class);
        progress.setProgressStatus(-10);
        finish();
        startActivity(intent);
    }
    }
}


