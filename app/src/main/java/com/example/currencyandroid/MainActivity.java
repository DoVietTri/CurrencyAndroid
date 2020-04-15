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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtCate1, txtCate2, txtConvert, txtNumber2;
    EditText edtNumber1;
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

    double result;
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
                String text = "1 " + cate[position1] + " = " + Double.toString(parse[position1][position2]) + cate[position2];
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
                String text = "1 " + cate[position2] + " = " + Double.toString(parse[position2][position1]) + cate[position1];
                txtConvert.setText(text);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void AnhXa() {
        txtCate1 = (TextView) findViewById(R.id.txtCate1);
        txtCate2 = (TextView) findViewById(R.id.txtCate2);
        txtConvert = (TextView) findViewById(R.id.txtConvert);
        txtNumber2 = (TextView) findViewById(R.id.txtNumber2);

        edtNumber1 = (EditText) findViewById(R.id.edtNumber1);

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

    @Override
    public void onClick(View v) {

    }
}
