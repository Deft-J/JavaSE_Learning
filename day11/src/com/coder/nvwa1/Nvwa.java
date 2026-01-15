package com.coder.nvwa1;

public class Nvwa {
    public static Person makePerson(String gender){
        if (gender.equals("男")){
            return new Male();
        }else{
            return new Female();
        }

    }
}
