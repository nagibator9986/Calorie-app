package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton beef, lamb, ostr, asiago, creme;
    TextView calories;
    CheckBox check;
    SeekBar bar;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ostr = (RadioButton) findViewById(R.id.radioButton4);
        lamb = (RadioButton) findViewById(R.id.radioButton5);
        beef = (RadioButton) findViewById(R.id.radioButton3);
        asiago = (RadioButton) findViewById(R.id.radioButton);
        creme = (RadioButton) findViewById(R.id.radioButton2);

        check = (CheckBox) findViewById(R.id.checkBox);

        bar = (SeekBar) findViewById(R.id.seekBar);

        calories = (TextView) findViewById(R.id.calor);




        ostr.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                count = 0;
                count = count + 300;
                calories.setText("0");
                calories.setText(Integer.toString(count));
            }
        });


        lamb.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                count = 0;
                count = count + 120;
                calories.setText("0");
                calories.setText(Integer.toString(count));
            }
        });


        beef.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                count = 0;
                count = count + 75;
                calories.setText("0");
                calories.setText(Integer.toString(count));
            }
        });




        check.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(check.isChecked()) {
                    count = count + 75;

                    calories.setText("0");

                    calories.setText(Integer.toString(count));
                }
                else {
                    count = count - 75;
                    calories.setText("0");
                    calories.setText(Integer.toString(count));
                }
            }
        });

        asiago.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                count = count + 50;
                calories.setText("0");
                calories.setText(Integer.toString(count));
            }
        });

        creme.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int tmp = count;
                tmp = tmp - 10;
                calories.setText("0");
                calories.setText(Integer.toString(tmp));
                count = tmp;
            }
        });



        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int bar = count;
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


                bar = bar + i;
                calories.setText("0");
                calories.setText(Integer.toString(bar+count));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                bar = count;
            }
        });

    }
}