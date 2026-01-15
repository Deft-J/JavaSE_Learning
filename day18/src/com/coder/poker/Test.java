package com.coder.poker;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Player> list=new ArrayList<>();
        list.add(new Player("李白",new ArrayList<>()));
        list.add(new Player("杜甫",new ArrayList<>()));
        list.add(new Player("白居易",new ArrayList<>()));
        list.add(new Player("底牌",new ArrayList<>()));
        Deal.deal(list);
        for (Player player : list) {
            System.out.println(player.getName());
            List<Poker> pokers = player.getPokers();
            System.out.println(pokers);
        }
    }
}