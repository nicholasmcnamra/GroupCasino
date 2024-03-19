package com.github.zipcodewilmington.utils;

import java.util.Random;

public class Dice {

    Random random = new Random();

    public int rollDie(Random random){
        return random.nextInt(6) + 1;
    }
}
