package com.github.zipcodewilmington.utils;



public class Craps extends Dice {

    int d1;
    int d2;
    int bet;
    int payout;

    public int chooseAmountToWager(int accountBalance) {
        try {
            IOConsole io = new IOConsole();
            int bet = io.getIntegerInput("How much would you like to wager?");
            this.bet = bet;
            if (bet > accountBalance) {
                System.out.println("Not enough funds available in your account!!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Not a number or integer");
        }
        return bet;
    }

    public void chooseYourBetPositions(){
        IOConsole io = new IOConsole();
        System.out.println("CRAPS BETTING POSITIONS: ");
        System.out.println("1. Any Seven");
        System.out.println("2. Big Six or Eight");
        System.out.println("3. Hardways");
        System.out.println("4. One Roll Bets");
        System.out.println("5. Any Craps Bet");
        int choice = io.getIntegerInput("Where do you want to place your bet?");
            switch(choice){
                case 1:
                    anySeven(bet);
                case 2:
                    bigSixAndEight(bet);
                case 3:
                    hardWays(bet);
                case 4:
                    oneRollBets(bet);
                case 5:
                    anyCrapsBet(bet);
            }
    }


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
        if(d1 == 3 && d2 == 3 || d1 == 5 && d2 == 1 ||
            d1 == 1 && d2 == 5 || d1 == 4 && d2 == 2 ||
                d1 == 2 && d2 == 4){
                return wager * wager;
        }
        if(d1 == 4 && d2 == 4 || d1 == 5 && d2 == 3 ||
            d1 == 3 && d2 == 5 || d1 == 6 && d2 == 2 ||
                d1 == 2 && d2 == 6){
                return wager * wager;
        }
        return - wager;
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
        //2,3,12 7 to 1
        d1 = rollDie(random);
        d2 = rollDie(random);
        if(d1 == 1 && d2 == 1 || d1 == 1 && d2 == 2 ||
            d1 == 2 && d2 ==1 || d1 == 6 && d2 == 6){
            return wager * 7;
        }
        return - wager;
    }

    public boolean endGame(int wager){
        return false;
    }
}
