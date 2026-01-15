package com.coder.lolgame;

public class Player {
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void play(Computer computer){
        Card card = computer.getCard();
        if (card.getType().equals("独立显卡") && card.getVideoMem()>=4){
            System.out.println(playerName+"可以玩英雄联盟游戏");
        }else{
            System.out.println(playerName+"不可以玩英雄联盟游戏");
        }
    }
}
