package com.company;

public class Calculator {

//    private final int a;
//    private final int b;
//    private final String sign;
    private static int res;
//
//    public Calculator() {
//        this.a = a;
//        this.b = b;
//        this.sign = sign;
//    }

    public static int calc(int a, int b, String sign){

        if (sign.equals("+")) res = a + b;
        if (sign.equals("-")) res = a - b;
        if (sign.equals("*")) res = a * b;
        if (sign.equals("/")) res = a / b;
        return res;
    }
}
