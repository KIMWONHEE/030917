package com.example.kim_wonhee.a170309;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button total;
    EditText write_price, write_count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("사과 총 금액");
        init();
    }


    void init() {
        total = (Button)findViewById(R.id.button);
        write_price = (EditText)findViewById(R.id.editText);
        write_count = (EditText)findViewById(R.id.editText2);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String price = write_price.getText().toString();
                String count = write_count.getText().toString();
                int result = Integer.parseInt(price) * Integer.parseInt(count);

                Toast.makeText(getApplicationContext(),"사과의 가격은 " + result + "원입니다.",Toast.LENGTH_LONG).show();
            }

        }
        );
    }

}
