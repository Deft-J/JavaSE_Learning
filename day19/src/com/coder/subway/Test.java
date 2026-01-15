package com.coder.subway;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Passenger> list = new ArrayList<>();
        list.add(new Passenger("李白", "凤凰山站", "万寿路站"));
        list.add(new Passenger("杜甫", "河滨公园站", "南京工业大学站"));
        Station.charge(list);
    }
}