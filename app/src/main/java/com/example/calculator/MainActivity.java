package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button add_operator, sub_operator, mul_operator,div_operator,equal_operator,remove;
   EditText editText;

   String number1, number2;
   int operatorType;//1==plus,2==minus,3==multiply,4==divide

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();

    }

    public void setUpViews(){
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

        editText=findViewById(R.id.et_textbox);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        add_operator.setOnClickListener(this);
        sub_operator.setOnClickListener(this);
        mul_operator.setOnClickListener(this);
        div_operator.setOnClickListener(this);
        equal_operator.setOnClickListener(this);

        remove.setOnClickListener(this);
  }

    @Override
    public void onClick(View v) {
      if(v.getId()== R.id.btn_zero)
      {
          editText.setText(editText.getText() + "0");
      }

        if(v.getId()== R.id.btn_one)
        {
            editText.setText(editText.getText() + "1");
        }

        if(v.getId()== R.id.btn_two)
        {
            editText.setText(editText.getText() + "2");
        }

        if(v.getId()==R.id.btn_three)
        {
            editText.setText(editText.getText()+"3");
        }

        if(v.getId()==R.id.btn_four)
        {
            editText.setText(editText.getText()+"4");
        }

        if(v.getId()==R.id.btn_five)
        {
            editText.setText(editText.getText()+"5");
        }

        if(v.getId()==R.id.btn_six)
        {
            editText.setText(editText.getText()+"6");
        }

        if(v.getId()==R.id.btn_seven)
        {
            editText.setText(editText.getText()+"7");
        }

        if(v.getId()==R.id.btn_eight)
        {
            editText.setText(editText.getText()+"8");
        }

        if(v.getId()==R.id.btn_nine)
        {
            editText.setText(editText.getText()+"9");
        }

        if(v.getId()== R.id.btn_plus)
        {
            operatorType = 1;
            number1 = editText.getText().toString();
            editText.setText("");
        }

        if(v.getId()==R.id.btn_minus)
        {
            operatorType=2;
            number1=editText.getText().toString();
            editText.setText("");
        }

        if(v.getId()==R.id.btn_multiply)
        {
            operatorType=3;
            number1=editText.getText().toString();
            editText.setText("");
        }

        if(v.getId()==R.id.btn_divide)
        {
            operatorType=4;
            number1=editText.getText().toString();
            editText.setText("");
        }

        if (v.getId() == R.id.btn_equalto) {

            number2 = editText.getText().toString();

            if (TextUtils.isEmpty(number1) || TextUtils.isEmpty(number2)) {
                return;
            }

            String equalToResult = "";
            int num1 =  Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);

            switch (operatorType) {
                case 1:
                    equalToResult = num1 +num2 + "";
                    break;
                case 2:
                    equalToResult= num1 - num2 + "";
                    break;
                case 3:
                    equalToResult= num1 * num2 + "";
                    break;
                case 4:
                    if (num2 == 0) {
                        //TODO need to show Toast
                        number2 = "";
                        editText.setText("");
                        return;
                    }
                equalToResult=num1 / num2 + "";
                break;
            }
            editText.setText(equalToResult);
            number1 = equalToResult;
        }

        if(v.getId()==R.id.btn_cross)
        {
            number1 = "";
            number2 = "";
            operatorType=0;
            editText.setText("");
        }
    }
}
