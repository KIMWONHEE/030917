package com.example.kim_wonhee.a170309;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    CheckBox discount;
    EditText write_pizza, write_pasta, write_salad;
    Button result;
    TextView text_count, text_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("레스토랑 메뉴 주문");
        init();
    }

    void init() {
        discount = (CheckBox)findViewById(R.id.checkBox);
        result = (Button)findViewById(R.id.button);
        write_pizza = (EditText)findViewById(R.id.editText);
        write_pasta = (EditText)findViewById(R.id.editText2);
        write_salad = (EditText)findViewById(R.id.editText3);

        text_count = (TextView)findViewById(R.id.textview6);
        text_total= (TextView)findViewById(R.id.textview7);

        result.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string_pizza = write_pizza.getText().toString();
                String string_pasta = write_pasta.getText().toString();
                String string_salad = write_salad.getText().toString();

                int num_pizza, num_pasta, num_salad;

                int count, total;

                if (string_pizza.equals("")) {
                    num_pizza = 0;
                    write_pizza.setText("0");
                }
                else
                    num_pizza = Integer.parseInt(string_pizza);

                if (string_pasta.equals("")) {
                    num_pasta = 0;
                    write_pasta.setText("0");
                }
                else
                    num_pasta = Integer.parseInt(string_pasta);

                if (string_salad.equals("")) {
                    num_salad = 0;
                    write_salad.setText("0");
                }
                else
                    num_salad = Integer.parseInt(string_salad);

                count = num_pizza + num_pasta + num_salad;

                total = (num_pizza * 15000) + (num_pasta * 13000) + (num_salad * 9000) ;

                if (discount.isChecked()) {
                    total = (int) (total * 0.9);
                }

                text_count.setText(count+"개");
                text_total.setText(total+"원");
            }
            }


        );


    }
}
