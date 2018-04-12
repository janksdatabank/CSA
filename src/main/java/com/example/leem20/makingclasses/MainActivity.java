package com.example.leem20.makingclasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TaxArithmetic ta = new TaxArithmetic();
        Arithmetic.mOperand1 = -2;
        Arithmetic.mOperand2 = 8;

        System.out.println(Arithmetic.add());


    }
}
