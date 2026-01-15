package com.coder.lambda;

import java.util.function.BinaryOperator;

public class Operation {
    public static void main(String[] args) {
        BinaryOperator<Integer> operator=(a,b)->a*b;
        operate(4,5,operator);
    }
    public static void operate(Integer a, Integer b, BinaryOperator<Integer> operator){
        Integer result=operator.apply(a,b);
        System.out.println(result);
    }
}
