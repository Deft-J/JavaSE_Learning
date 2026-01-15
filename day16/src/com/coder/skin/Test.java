package com.coder.skin;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Player a=new Player("李白", LocalDate.of(2025,9,5));
        Player b=new Player("李信",LocalDate.of(2025,9,10));
        Player c=new Player("白起",LocalDate.of(2025,9,28));
        Player d=new Player("李元芳",LocalDate.of(2025,10,10));
        Player[] players={a,b,c,d};
        BuySkin(players);
    }
    public static void BuySkin(Player[] players){
        int m=1788;
        LocalDate onlineDate=LocalDate.of(2025,9,2);
        Skin skin=new Skin();
        for(Player p:players){
            int n=skin.buy(onlineDate,p.getBuyDate());
            if (n==-1){
                System.out.println("该皮肤已经下线,无法购买");
            }else{
                System.out.println(p.getName()+"于"+p.getBuyDate()+"购买皮肤花费"+n*1788*0.1);
            }
        }
    }
}
