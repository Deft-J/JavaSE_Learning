package com.coder.telephone;
import com.sun.source.tree.LiteralTree;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(1000);
        Random rand=new Random();
        for(int i=0;i<1000;i++){
            list.add(Telephone.getNumber(rand));
        }
        List<String> list1=new ArrayList<>(4);
        for(int i=0;i<4;i++){
            int index=rand.nextInt(list.size());
            list1.add(list.get(index));
        }
        for(ListIterator<String> iter=list1.listIterator();iter.hasNext();){
            iter.set(new StringBuffer(iter.next()).replace(3,7,"****").toString());
        }
        System.out.println("中奖号码为：");
        for (String s:list1){
            System.out.println(s);
        }
    }
}
