package com.github.zipcodewilmington.casino.games.Roulette;

import com.github.zipcodewilmington.casino.games.RandomNumber;
import java.util.Random;

public class Wheel implements RandomNumber {
    int [] wheelArray = new int[]{0, 26, 3, 35, 12, 28, 7, 29, 18, 22, 9, 31, 14, 20, 1, 33, 16, 24, 5, 10, 23, 8, 30, 11, 36, 13, 27, 6, 34, 17, 25, 2, 21, 4, 19, 15, 32};
    Random randomNum = new Random();


    public Wheel() {
    }

    public int spinWheel() {
        int spinResult = randomNum.nextInt(wheelArray.length);
        return spinResult;
    }

    @Override
    public int randomNumberGenerator() {
        return 0;
    }
}
