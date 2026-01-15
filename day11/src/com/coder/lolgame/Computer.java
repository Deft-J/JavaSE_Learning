package com.coder.lolgame;

public class Computer {
    private String brand;
    private Card card;

    public Computer(Card card, String brand) {
        this.card = card;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
