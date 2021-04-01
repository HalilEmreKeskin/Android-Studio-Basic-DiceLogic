package com.halilemrekeskin.rolldice;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button rolldice;
    ImageView dice1,dice2;
    TextView textView;
    int numb1,numb2;
    String sum ="";
    Random random1,random2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rolldice=findViewById(R.id.button);
        dice1=findViewById(R.id.dice1);
        dice2=findViewById(R.id.dice2);
        textView=findViewById(R.id.textView);
        random1= new Random();
        random2 = new Random();

    }
    public void clickButton(View view){
        numb1 =1+(random1.nextInt(6));
        numb2 =1+(random2.nextInt(6));
        diceLogic(dice1,numb1);
        diceLogic(dice2,numb2);
        sum=String.valueOf(numb1+numb2);
        textView.setText("Sum:"+sum);

    }
    public void diceLogic(ImageView dice,int randomNumber){
        switch (randomNumber){
            case 1:
                dice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dice.setImageResource(R.drawable.dice6);
                break;

        }
    }

}