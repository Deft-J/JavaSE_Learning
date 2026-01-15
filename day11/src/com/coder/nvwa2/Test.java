package com.coder.nvwa2;

public class Test {
    public static void main(String[] args) {
        Nvwa nvwa1=new MaleLine();
        Nvwa nvwa2=new FemaleLine();
        Person person1= nvwa1.makePerson();
        Person person2= nvwa2.makePerson();
        person1.eat();
        person1.sleep();
        person1.talk();
        person2.eat();
        person2.sleep();
        person2.talk();

    }
}
