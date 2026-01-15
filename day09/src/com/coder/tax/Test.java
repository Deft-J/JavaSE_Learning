package com.coder.tax;

public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Car[] cars = shop.organize();
        TaxDept taxDept = new TaxDept();
        taxDept.tax(cars);
    }
}
