package com.example.kim_wonhee.a170309;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Button CtoF, FtoC;
    EditText write_C, write_F;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("섭씨 온도, 화씨 온도 계산");
        init();
    }

    void init() {
        CtoF = (Button)findViewById(R.id.button);
        FtoC = (Button)findViewById(R.id.button2);
        write_C = (EditText)findViewById(R.id.editText);
        write_F = (EditText)findViewById(R.id.editText2);

        CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ctemp = write_C.getText().toString();
                double result_F = Double.parseDouble(ctemp) * 1.8 + 32;

                Toast.makeText(getApplicationContext(),"화씨 온도는 " + result_F + "도 입니다.",Toast.LENGTH_LONG).show();
            }
        }
        );

        FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ftemp = write_F.getText().toString();
                double result_C =(Double.parseDouble(ftemp) - 32) / 1.8;

                Toast.makeText(getApplicationContext(),"섭씨 온도는 " + result_C + "도 입니다.",Toast.LENGTH_LONG).show();
            }
                                 }
        );

    }
}
