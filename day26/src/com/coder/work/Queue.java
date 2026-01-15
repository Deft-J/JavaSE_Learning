package com.coder.work;

import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Queue {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue(2);
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                String id = IdUtil.getId();
                Message message = new Message(id, "消息信息" + id);
                queue.put(message);
            }, "产生者" + i).start();
        }
        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "消费者").start();
    }
}

class Message{
    private String id;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Message(String id, Object data) {
        this.id = id;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", data=" + data +
                '}';
    }
}
class IdUtil{
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
}

class MessageQueue{
    private LinkedList<Message> list ;
    private static final Object lock = new Object();
    private int capacity;
    public MessageQueue(int capacity){
        this.capacity = capacity;
        list = new LinkedList<>();
    }
    public Message take(){
        synchronized (lock){
            while(list.isEmpty()){
                System.out.println("消息队列为空，需要等待");
                try{
                    lock.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            Message message=list.removeFirst();
            System.out.println("读取到一个消息："+message);
            lock.notifyAll();
            return message;
        }
    }
    public void put(Message message){
        synchronized (lock){
            while(list.size()==capacity){
                System.out.println("消息队列已满，需要等待");
                try{
                    lock.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            list.addLast(message);
            System.out.println(Thread.currentThread().getName()+"已产生一个消息："+message);
            lock.notifyAll();
        }
    }
}


