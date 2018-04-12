package com.example.leem20.makingclasses;

/**
 * Created by leem20 on 4/10/2018.
 */

public class Arithmetic {

    public static int mOperand1;
    public static int mOperand2;
    Arithmetic a;
    TaxArithmetic b;


    public Arithmetic(){
        mOperand1 = 2;
        mOperand2 = 3;
    }
    public Arithmetic(int operand1, int operand2) {
        operand1 = a.mOperand1;
        operand2 = a.mOperand2;
    }
    public String toString() {
        return "Arithmetic Instance:  mOperand1 = " + mOperand1 + "; mOperand2 = " + mOperand2 + ".";
    }
    public static int add() {
        return mOperand1 + mOperand2;
    }
    public static int subtract() {
        return mOperand1 - mOperand2;
    }
    public static int divide() {
        return mOperand1 / mOperand2;
    }
    public static int multiply() {
        return mOperand1 * mOperand2;
    }
    public static int add(int operand1, int operand2){
        return operand1 + operand2;
    }
}
