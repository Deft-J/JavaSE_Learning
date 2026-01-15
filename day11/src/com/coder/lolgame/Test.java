package com.coder.lolgame;

public class Test {
    public static void main(String[] args) {
        Card card = new Card();
        card.setType("独立显卡");
        card.setVideoMem(4);
        Computer computer=new Computer(card,"惠普");
        Player player=new Player();
        player.setPlayerName("李白");
        player.play(computer);
    }

}
