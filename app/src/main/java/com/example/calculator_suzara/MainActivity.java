package com.example.calculator_suzara;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero,
            clear, clear_everything, add, subtract, multiply, divide, sign, decimal, equals;
    int operator;
    TextView input, equation_view;

    private double number_1, number_2, result_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.num1_button);
        two = findViewById(R.id.num2_button);
        three = findViewById(R.id.num3_button);
        four = findViewById(R.id.num4_button);
        five = findViewById(R.id.num5_button);
        six = findViewById(R.id.num6_button);
        seven = findViewById(R.id.num7_button);
        eight = findViewById(R.id.num8_button);
        nine = findViewById(R.id.num9_button);
        zero = findViewById(R.id.num0_button);
        clear = findViewById(R.id.clear_button);
        clear_everything = findViewById(R.id.clear_everything_button);
        add = findViewById(R.id.add_button);
        subtract = findViewById(R.id.subtract_button);
        multiply = findViewById(R.id.multiply_button);
        divide = findViewById(R.id.divide_button);
        sign = findViewById(R.id.sign_button);
        decimal = findViewById(R.id.decimal_button);
        equals = findViewById(R.id.equals_button);

        input = findViewById(R.id.input_view);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.zero));
                } else {
                    current += getResources().getString(R.string.zero);
                    input.setText(current);
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.one));
                } else {
                    current += getResources().getString(R.string.one);
                    input.setText(current);
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.two));
                } else {
                    current += getResources().getString(R.string.two);
                    input.setText(current);
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.three));
                } else {
                    current += getResources().getString(R.string.three);
                    input.setText(current);
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.four));
                } else {
                    current += getResources().getString(R.string.four);
                    input.setText(current);
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.five));
                } else {
                    current += getResources().getString(R.string.five);
                    input.setText(current);
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.six));
                } else {
                    current += getResources().getString(R.string.six);
                    input.setText(current);
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.seven));
                } else {
                    current += getResources().getString(R.string.seven);
                    input.setText(current);
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.eight));
                } else {
                    current += getResources().getString(R.string.eight);
                    input.setText(current);
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = input.getText().toString();
                if (current.equals(getString(R.string.zero))) {
                    input.setText(getResources().getString(R.string.nine));
                } else {
                    current += getResources().getString(R.string.nine);
                    input.setText(current);
                }
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(input.getText().toString());
                temp *= -1;
                input.setText(Integer.toString(temp));
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = input.getText().toString();
                if(!temp.contains("."));
                temp += ".";
                input.setText(temp);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_1 = Double.parseDouble(input.getText().toString());
                input.setText("");

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_1 = 0;
                input.setText(getResources().getString(R.string.zero));
            }
        });

        clear_everything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(getResources().getString(R.string.zero));
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_1 = Double.parseDouble(input.getText().toString());
                input.setText("0");
                operator = R.string.add;
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_1 = Double.parseDouble(input.getText().toString());
                input.setText("0");
                operator = R.string.subtract;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_1 = Double.parseDouble(input.getText().toString());
                input.setText("0");
                operator = R.string.multiply;
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_1 = Double.parseDouble(input.getText().toString());
                input.setText("0");
                operator = R.string.divide;
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operator) {
                    case R.string.add:
                        number_2 = Double.parseDouble(input.getText().toString());
                        result_number = number_1 + number_2;
                        input.setText(Integer.toString((int) result_number));
                        break;
                    case R.string.subtract:
                        number_2 = Double.parseDouble(input.getText().toString());
                        result_number = number_1 - number_2;
                        input.setText(Integer.toString((int) result_number));
                        break;
                    case R.string.multiply:
                        number_2 = Double.parseDouble(input.getText().toString());
                        result_number = number_1 * number_2;
                        input.setText(Integer.toString((int) result_number));
                        break;
                    case R.string.divide:
                        number_2 = Double.parseDouble(input.getText().toString());
                        result_number = number_1 / number_2;
                        input.setText(Double.toString(result_number));
                        break;
                }
            }
        });

    }

}