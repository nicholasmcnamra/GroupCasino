package com.github.zipcodewilmington.utils;

public class Craps extends Dice {

    int d1;
    int d2;
    int bet;
    int payout;




    public int anySeven(int wager){
        d1 = rollDie(random);
        d2 = rollDie(random);
        return 0;
    }

    public int bigSixAndEight(int wager){
        d1 = rollDie(random);
        d2 = rollDie(random);
        return 0;
    }

    public int hardWays(int wager){
        d1 = rollDie(random);
        d2 = rollDie(random);
        return 0;
    }

    public int oneRollBets(int wager){
        d1 = rollDie(random);
        d2 = rollDie(random);
        return 0;
    }

    public int crapsBet(int wager){
        d1 = rollDie(random);
        d2 = rollDie(random);
        return 0;
    }

    public int lose(int wager){
        return -wager;
    }
}
