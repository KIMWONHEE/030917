package com.example.kim_wonhee.a170309;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    Button plus, minus, multiple, divide;
    EditText write_num1, write_num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setTitle("계산기 만들기");
        init();
    }

    void init() {
        plus = (Button) findViewById(R.id.button);
        minus = (Button) findViewById(R.id.button2);
        multiple = (Button) findViewById(R.id.button3);
        divide = (Button) findViewById(R.id.button4);

        write_num1 = (EditText) findViewById(R.id.editText);
        write_num2 = (EditText) findViewById(R.id.editText2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (write_num1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    write_num1.requestFocus();
                } else if (write_num2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    write_num2.requestFocus();
                } else {
                    String num1 = write_num1.getText().toString();
                    String num2 = write_num2.getText().toString();

                    int result = Integer.parseInt(num1) + Integer.parseInt(num2);

                    Toast.makeText(getApplicationContext(), "더하기 계산 결과는 " + result + "입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        }

        );

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (write_num1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    write_num1.requestFocus();
                } else if (write_num2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    write_num2.requestFocus();
                } else {
                    String num1 = write_num1.getText().toString();
                    String num2 = write_num2.getText().toString();

                    int result = Integer.parseInt(num1) - Integer.parseInt(num2);

                    Toast.makeText(getApplicationContext(), "빼기 계산 결과는 " + result + "입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        }
        );

        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (write_num1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    write_num1.requestFocus();
                } else if (write_num2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    write_num2.requestFocus();
                } else {
                    String num1 = write_num1.getText().toString();
                    String num2 = write_num2.getText().toString();

                    int result = Integer.parseInt(num1) * Integer.parseInt(num2);

                    Toast.makeText(getApplicationContext(), "곱하기 계산 결과는 " + result + "입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        }
        );

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (write_num1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    write_num1.requestFocus();
                } else if (write_num2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                    write_num2.requestFocus();
                } else {
                    String num1 = write_num1.getText().toString();
                    String num2 = write_num2.getText().toString();

                    double result = Double.parseDouble(num1) / Double.parseDouble(num2);

                    int fin_result = (int) result;

                    Toast.makeText(getApplicationContext(), "나누기 계산 결과는 " + fin_result + "입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        }
        );

    }

}
