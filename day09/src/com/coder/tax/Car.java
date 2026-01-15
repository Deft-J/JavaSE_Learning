package com.coder.tax;

public class Car {
    private String brand;
    private double emissions;
     public Car(String brand, double emissions) {
         this.brand = brand;
         this.emissions = emissions;
     }
     public Car() {
     }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getEmissions() {
        return emissions;
    }

    public void setEmissions(double emissions) {
        this.emissions = emissions;
    }
}
