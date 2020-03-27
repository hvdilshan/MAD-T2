package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Gravity;


public class FirstActivity extends AppCompatActivity {

    EditText no1, no2;
    Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        no1 = (EditText) findViewById(R.id.editText3);
        no2 = (EditText) findViewById(R.id.editText5);
        btn_ok = (Button) findViewById(R.id.btn_ok);


        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);

                i.putExtra("NUM1", no1.getText().toString());
                i.putExtra("NUM2", no2.getText().toString());

                Context context = getApplicationContext();
                CharSequence message = "Sending message...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                toast.show();

                startActivity(i);

            }
        });
    }
}
