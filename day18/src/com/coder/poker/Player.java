package com.coder.poker;
import java.util.List;

public class Player {
    private String name;
    private List<Poker> pokers;


    public Player(String name, List<Poker> pokers) {
        this.name = name;
        this.pokers = pokers;
    }

    public Player(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Poker> getPokers() {
        return pokers;
    }

    public void setPokers(List<Poker> pokers) {
        this.pokers = pokers;
    }
}
