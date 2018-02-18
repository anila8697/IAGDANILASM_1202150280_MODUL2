package com.example.android.iagdanilasm_1202150280_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClickedTakeAway(View view) {

    }

    public void onRadioButtonClickedDineIn(View view) {
    }

    public void onRadioButtonClicked(View view) {
        RadioButton dine =(RadioButton) findViewById(R.id.radiodinein);
        RadioButton take =(RadioButton) findViewById(R.id.radiotakeaway);

        if(dine.isChecked()){
            Intent a = new Intent(this,DineInActivity.class);
            Toast.makeText(MainActivity.this,"Dine In",Toast.LENGTH_LONG).show();
            startActivity(a);
        }else if(take.isChecked()){
            Intent b = new Intent(this,TakeAwayActivity.class);
            Toast.makeText(MainActivity.this,"Take Away",Toast.LENGTH_LONG).show();
            startActivity(b);
        }else{
            Toast nope = Toast.makeText(this,"Pilih Salah Satu", Toast.LENGTH_LONG);
            nope.show();
        }
    }
    }
