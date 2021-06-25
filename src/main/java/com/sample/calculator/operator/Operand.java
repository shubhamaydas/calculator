package com.sample.calculator.operator;

public class Operand extends Term {
    private double value;
    public Operand(double value){
        this.value = value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
