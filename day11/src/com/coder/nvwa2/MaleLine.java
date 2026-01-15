package com.coder.nvwa2;

import javax.sound.sampled.Line;

public class MaleLine implements Nvwa {

    @Override
    public Person makePerson() {
        return new Male();
    }
}
