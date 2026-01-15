package com.coder.work;

public class Game2 {
    public static void main(String[] args) {
        PlayGame playGame = new PlayGame();
        playGame.setFlag(1);
        playGame.setLoop(5);

        new Thread(()->{
            playGame.product("产生超级兵",1,2);
        },"产生超级兵线程").start();
        new Thread(()->{
            playGame.product("超级兵移动",2,3);
        },"超级兵移动线程").start();
        new Thread(()->{
            playGame.product("攻击防御塔",3,1);
        },"攻击防御塔线程").start();
    }
}
class PlayGame{
    private int flag;
    private int loop;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getLoop() {
        return loop;
    }

    public void setLoop(int loop) {
        this.loop = loop;
    }
    public void product(String op,int wait,int nextFlag){
        for (int i = 0; i < loop; i++) {
            synchronized (this) {
                while (flag == wait) {
                    try{
                        this.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+":"+op);
                flag = nextFlag;
                this.notifyAll();
            }
        }
    }
}