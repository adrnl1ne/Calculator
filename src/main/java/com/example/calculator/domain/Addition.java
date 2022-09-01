package com.example.calculator.domain;

public class Addition {
    private double num1;
    private double num2;


    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double Total() {
        return num1 + num2;
    }
}
