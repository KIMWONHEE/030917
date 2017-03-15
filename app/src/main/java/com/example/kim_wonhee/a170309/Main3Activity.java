package com.example.kim_wonhee.a170309;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button age, year;
    EditText write_age, write_year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("나이 계산");
        init();
    }


    void init() {
        age = (Button)findViewById(R.id.button6);
        year = (Button)findViewById(R.id.button7);
        write_year = (EditText)findViewById(R.id.editText3);
        write_age = (EditText)findViewById(R.id.editText4);

        age.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                String year = write_year.getText().toString();
                int result_age = 2017 - Integer.parseInt(year) + 1;

                Toast.makeText(getApplicationContext(),"당신의 나이는 " + result_age + "세 입니다.",Toast.LENGTH_LONG).show();
            }
        }
        );

        year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = write_age.getText().toString();
                int result_birth = 2017 - Integer.parseInt(num) + 1;

                Toast.makeText(getApplicationContext(),"당신의 태어난 해는 " + result_birth + "년도 입니다.",Toast.LENGTH_LONG).show();
            }

        }
        );

    }
}
