package com.example.currencyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txtCate1, txtCate2, txtConvert, txtNumber1, txtNumber2;
    Spinner spinner1;
    Spinner spinner2;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDelete, btnCE, btnDot;
    String items[] = {"Vietnam-Dong", "Japan-Yen", "United State-Dollar", "Laos-Kip", "Europe-EUR"};
    String cate[]  = {"VND", "Yen", "Dollar", "Kip", "EUR"};

    double parse[][] = {
            {1, 0.004567, 0.00004261,  0.38, 0.00003886},
            {218.9459, 1, 0.009328, 83.1919, 0.008509},
            {23471.00, 107.20, 1, 8918.17, 0.9122},
            {2.6318, 0.01202, 0.0001121, 1, 0.0001023},
            {25730.103, 117.5181, 1.0963, 9776.5512, 1}
    };

    int position1, position2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtCate1.setText(cate[position]);
                position1 = position;
                reset();
                String text = "1 " + cate[position1] + " = " + Double.toString(parse[position1][position2])  +  " " +cate[position2];
                txtConvert.setText(text);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtCate2.setText(cate[position]);
                position2 = position;
                reset();
                String text = "1 " + cate[position1] + " = " + Double.toString(parse[position1][position2]) + " " + cate[position2];
                txtConvert.setText(text);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() == "0") {
                    txtNumber1.setText("0");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                } else {
                    txtNumber1.setText(txtNumber1.getText() + "0");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() == "0") {
                    txtNumber1.setText("1");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                } else {
                    txtNumber1.setText(txtNumber1.getText() + "1");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() == "0") {
                    txtNumber1.setText("2");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                } else {
                    txtNumber1.setText(txtNumber1.getText() + "2");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() == "0") {
                    txtNumber1.setText("3");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                } else {
                    txtNumber1.setText(txtNumber1.getText() + "3");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() == "0") {
                    txtNumber1.setText("4");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                } else {
                    txtNumber1.setText(txtNumber1.getText() + "4");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() == "0") {
                    txtNumber1.setText("5");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                } else {
                    txtNumber1.setText(txtNumber1.getText() + "5");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() == "0") {
                    txtNumber1.setText("6");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                } else {
                    txtNumber1.setText(txtNumber1.getText() + "6");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() == "0") {
                    txtNumber1.setText("7");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                } else {
                    txtNumber1.setText(txtNumber1.getText() + "7");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() == "0") {
                    txtNumber1.setText("8");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                } else {
                    txtNumber1.setText(txtNumber1.getText() + "8");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() == "0") {
                    txtNumber1.setText("9");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                } else {
                    txtNumber1.setText(txtNumber1.getText() + "9");
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNumber1.getText() != "") {
                    txtNumber1.setText(txtNumber1.getText() +".");
                }
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = txtNumber1.getText().length();
                if (length > 1) {
                    StringBuilder back = new StringBuilder(txtNumber1.getText());
                    back.deleteCharAt(length-1);
                    txtNumber1.setText(back.toString());
                    txtNumber2.setText(String.valueOf(Double.parseDouble(txtNumber1.getText().toString())*parse[position1][position2]));
                }
                if (length == 1) {
                    reset();
                }
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }

    public void reset() {
        txtNumber1.setText("0");
        txtNumber2.setText("0");
    }

    public void AnhXa() {
        txtCate1 = (TextView) findViewById(R.id.txtCate1);
        txtCate2 = (TextView) findViewById(R.id.txtCate2);
        txtConvert = (TextView) findViewById(R.id.txtConvert);
        txtNumber1 = (TextView) findViewById(R.id.txtNumber1);
        txtNumber2 = (TextView) findViewById(R.id.txtNumber2);


        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnCE = (Button) findViewById(R.id.btnCE);

        spinner1 = (Spinner) findViewById(R.id.spn1);
        spinner2 = (Spinner) findViewById(R.id.spn2);

    }

}
