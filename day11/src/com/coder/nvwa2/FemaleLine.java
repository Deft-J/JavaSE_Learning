package com.coder.nvwa2;

import javax.sound.sampled.Line;

public class FemaleLine implements Nvwa {

    @Override
    public Person makePerson() {
        return new Female();
    }
}
