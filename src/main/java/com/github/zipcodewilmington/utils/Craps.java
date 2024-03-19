package com.github.zipcodewilmington.utils;

public class Craps extends Dice {

    int d1;
    int d2;
    int bet;
    int payout;




    public int anySeven(int wager){
        d1 = rollDie(random);
        d2 = rollDie(random);
        if(d1 == 2 && d2 == 5 || d1 == 5 && d2 == 2 ||
           d1 == 4 && d2 == 3 || d1 == 3 && d2 == 4 ||
           d1 == 1 && d2 == 6 || d1 == 6 && d2 == 1){
            return wager * 7;
        }
        return - wager;
    }

    public int bigSixAndEight(int wager){
        d1 = rollDie(random);
        d2 = rollDie(random);
        return 0;
    }

    public int hardWays(int wager){
        d1 = rollDie(random);
        d2 = rollDie(random);
        if(d1 == 3 && d2 == 3 || d1 == 4 && d2 == 4){
            return wager * 9;
        }else if(d1 == 5 && d2 == 5 || d1 == 2 && d2 == 2){
            return wager * 7;
        }
        return -wager;

    }

    public int oneRollBets(int wager){
        d1 = rollDie(random);
        d2 = rollDie(random);
        if(d1 == 1 && d2 == 1 || d1 == 6 && d2 == 6){
            return wager * 30;
        }else if(d1 == 1 && d2 == 2){
            return wager * 15;
        }else if(d1 == 2 && d2 == 1){
            return wager * 15;
        } else if(d1 == 5 && d2 == 6 || d1 == 6 && d2 == 5) {
            return wager * 15;
        }
        return - wager;
    }

    public int anyCrapsBet(int wager){
        d1 = rollDie(random);
        d2 = rollDie(random);
        return 0;
    }

    public int lose(int wager){
        return -wager;
    }
}
