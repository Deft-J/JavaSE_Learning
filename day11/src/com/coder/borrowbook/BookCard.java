package com.coder.borrowbook;

public class BookCard {
    private String type;
    private String color;

    public BookCard(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public BookCard() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    }

