package com.coder.zoo;

import java.util.Objects;

public class Tiger implements Cloneable {
    private double height;
    private double weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Tiger(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public Tiger(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiger tiger = (Tiger) o;
        return Double.compare(height, tiger.height) == 0 && Double.compare(weight, tiger.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
