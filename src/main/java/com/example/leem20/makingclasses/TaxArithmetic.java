package com.example.leem20.makingclasses;

/**
 * Created by leem20 on 4/12/2018.
 */

public class TaxArithmetic extends Arithmetic{
    public double calculateTax(double purchaseAmount, double taxRate){
        double tax;
        tax = purchaseAmount * taxRate;
        return tax;
    }
    public double calculateTax(double taxRate) {
        double tax;
        int purchaseAmount = mOperand1 + mOperand2;
        tax = purchaseAmount * taxRate;
        return tax;
    }
}
