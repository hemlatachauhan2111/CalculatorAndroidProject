package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button add_operator, sub_operator, mul_operator,div_operator,equal_operator,remove;
   EditText textbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=findViewById(R.id.btn_zero);
        button1=findViewById(R.id.btn_one);
        button2=findViewById(R.id.btn_two);
        button3=findViewById(R.id.btn_three);
        button4=findViewById(R.id.btn_four);
        button5=findViewById(R.id.btn_five);
        button6=findViewById(R.id.btn_six);
        button7=findViewById(R.id.btn_seven);
        button8=findViewById(R.id.btn_eight);
        button9=findViewById(R.id.btn_nine);
        add_operator=findViewById(R.id.btn_plus);
        sub_operator=findViewById(R.id.btn_minus);
        mul_operator=findViewById(R.id.btn_multiply);
        div_operator=findViewById(R.id.btn_divide);
        equal_operator=findViewById(R.id.btn_equalto);
        remove=findViewById(R.id.btn_cross);
        textbox=findViewById(R.id.et_textbox);

    }

    @Override
    public void onClick(View v) {

    }
}
