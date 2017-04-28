package com.example.android.projekt22;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.text.Html.fromHtml;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * reset).
         */

        final TextView addResultr1;
        final TextView addResultr2;
        final TextView addResultr3;
        final TextView addResultr4;
        Button reset;

        final int[] sumr = new int[1];

        addResultr1 = (TextView) findViewById(R.id.txtResult1);
        addResultr2 = (TextView) findViewById(R.id.txtResult2);
        addResultr3 = (TextView) findViewById(R.id.txtResult3);
        addResultr4 = (TextView) findViewById(R.id.txtResult4);
        final EditText oneNumberr = (EditText) findViewById(R.id.txtNumber1);
        final EditText twoNumberr = (EditText) findViewById(R.id.txtNumber2);
        final EditText threeNumberr = (EditText) findViewById(R.id.txtNumber3);
        final EditText fourNumberr = (EditText) findViewById(R.id.txtNumber4);


        reset = (Button) findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                sumr[0] = 0;
                fourNumberr.setText(Integer.toString(sumr[0]));
                threeNumberr.setText(Integer.toString(sumr[0]));
                twoNumberr.setText(Integer.toString(sumr[0]));
                oneNumberr.setText(Integer.toString(sumr[0]));
                addResultr1.setText(Integer.toString(sumr[0]));
                addResultr2.setText(Integer.toString(sumr[0]));
                addResultr3.setText(Integer.toString(sumr[0]));
                addResultr4.setText(Integer.toString(sumr[0]));
            }
        });

        /**
         * add points ( player1).
         */

        final EditText oneNumber;
        final TextView addResult;
        Button btnAdd;

        final int[] num1 = new int[1];
        final int[] sum1 = new int[1];

        oneNumber = (EditText) findViewById(R.id.txtNumber1);
        addResult = (TextView) findViewById(R.id.txtResult1);
        btnAdd = (Button) findViewById(R.id.btnAdd1);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (oneNumber.getText().toString().trim().length() == 0) {
                } else {
                    num1[0] = (int) Double.parseDouble(oneNumber.getText().toString());
                    sum1[0] += num1[0];
                    addResult.setText(Integer.toString(sum1[0]));

                }
            }
        });

        /**
         * add points ( player2).
         */

        final EditText twoNumber;
        final TextView addResult2;
        Button btnAdd2;

        final int[] num2 = new int[1];
        final int[] sum2 = new int[1];

        twoNumber = (EditText) findViewById(R.id.txtNumber2);
        addResult2 = (TextView) findViewById(R.id.txtResult2);
        btnAdd2 = (Button) findViewById(R.id.btnAdd2);

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (twoNumber.getText().toString().trim().length() == 0) {
                } else {
                    num2[0] = (int) Double.parseDouble(twoNumber.getText().toString());
                    sum2[0] += num2[0];
                    addResult2.setText(Integer.toString(sum2[0]));
                }
            }
        });

        /**
         * add points ( player3).
         */

        final EditText threeNumber;
        final TextView addResult3;
        Button btnAdd3;

        final int[] num3 = new int[1];
        final int[] sum3 = new int[1];

        threeNumber = (EditText) findViewById(R.id.txtNumber3);
        addResult3 = (TextView) findViewById(R.id.txtResult3);
        btnAdd3 = (Button) findViewById(R.id.btnAdd3);

        btnAdd3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (threeNumber.getText().toString().trim().length() == 0) {
                } else {

                    num3[0] = (int) Double.parseDouble(threeNumber.getText().toString());
                    sum3[0] += num3[0];
                    addResult3.setText(Integer.toString(sum3[0]));
                }
            }
        });

        /**
         * add points ( player4).
         */

        final EditText fourNumber;
        final TextView addResult4;
        Button btnAdd4;

        final int[] num4 = new int[1];
        final int[] sum4 = new int[1];

        fourNumber = (EditText) findViewById(R.id.txtNumber4);
        addResult4 = (TextView) findViewById(R.id.txtResult4);
        btnAdd4 = (Button) findViewById(R.id.btnAdd4);

        btnAdd4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (fourNumber.getText().toString().trim().length() == 0) {
                } else {

                    num4[0] = (int) Double.parseDouble(fourNumber.getText().toString());
                    sum4[0] += num4[0];
                    addResult4.setText(Integer.toString(sum4[0]));

                }
            }
        });

        /**
         * Subscripts in TextView.
         */

        TextView text = (TextView) findViewById(R.id.S);
        {
            text.setText(fromHtml("S <sub><small> 1 </small></sub>"));

            text = (TextView) findViewById(R.id.C);
            text.setText(fromHtml("C <sub><small> 3 </small></sub>"));

            text = (TextView) findViewById(R.id.R);
            text.setText(fromHtml("R <sub><small> 1 </small></sub>"));

            text = (TextView) findViewById(R.id.A);
            text.setText(fromHtml("A <sub><small> 1 </small></sub>"));

            text = (TextView) findViewById(R.id.B);
            text.setText(fromHtml("B <sub><small> 3 </small></sub>"));

            text = (TextView) findViewById(R.id.BB);
            text.setText(fromHtml("B <sub><small> 3 </small></sub>"));

            text = (TextView) findViewById(R.id.L);
            text.setText(fromHtml("L <sub><small> 1 </small></sub>"));

            text = (TextView) findViewById(R.id.E);
            text.setText(fromHtml("E <sub><small> 1 </small></sub>"));

        }


    }
}