package com.coder.tax;

public class TaxDept {
    public void tax(Car[] cars){
        int tax=0;
        for (Car car : cars) {
            double emissions=car.getEmissions();
            if (emissions<=1){
                System.out.println(car.getBrand()+"收取"+360+"元");
                tax+=360;
            } else if (emissions<=1.6) {
                System.out.println(car.getBrand()+"收取"+420+"元");
                tax+=420;
            } else if (emissions<=2.0) {
                System.out.println(car.getBrand()+"收取"+540+"元");
                tax+=540;
            } else if (emissions<=2.5) {
                System.out.println(car.getBrand()+"收取"+800+"元");
                tax+=800;
            } else if (emissions<=3.0) {
                System.out.println(car.getBrand()+"收取"+1800+"元");
                tax+=1800;
            } else if (emissions<=4.0) {
                System.out.println(car.getBrand() + "收取" + 2800 + "元");
                tax += 2800;
            }
        }
        System.out.println("税务局收了"+tax+"元");
    }
}
