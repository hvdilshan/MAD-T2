package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView no1, no2;
    TextView method;
    Button sum;
    Button min;
    Button div;
    Button mul;

    String num1;
    String num2;

    double val1,val2,total =0;

    CharSequence message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        no1 = (TextView) findViewById(R.id.editText2);
        no2 = (TextView) findViewById(R.id.editText3);
        method = (TextView) findViewById(R.id.method);

        sum = (Button) findViewById(R.id.btn_sum);
        min =(Button) findViewById(R.id.btn_min);
        div = (Button) findViewById(R.id.btn_div);
        mul = (Button) findViewById(R.id.btn_mul);

        Intent receive = getIntent();

        num1 = receive.getStringExtra("NUM1");
        num2 = receive.getStringExtra("NUM2");

        no1.setText(num1);
        no2.setText(num2);

        val1 = Double.parseDouble(num1);
        val2 = Double.parseDouble(num2);

        final Context context = getApplicationContext();

        final int duration = Toast.LENGTH_SHORT;
        final Toast toast = Toast.makeText(context,message,duration);
        toast.setGravity(Gravity.BOTTOM,0,0);

        sum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                method.setText(val1 +" + "+ val2 +" = "+ (val1+val2));

                message = "Add two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.BOTTOM,0,200);
                toast.show();
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" - "+ val2 +" = "+ (val1-val2));

                message = "Subtract two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.BOTTOM,0,200);
                toast.show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" / "+ val2 +" = "+ (val1/val2));

                message = "Devide two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.BOTTOM,0,200);
                toast.show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                method.setText(val1 +" * "+ val2 +" = "+ (val1*val2));

                message = "Multiply two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.BOTTOM,0,200);
                toast.show();
            }
        });
    }
}
