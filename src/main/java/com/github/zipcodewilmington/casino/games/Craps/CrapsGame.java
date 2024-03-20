package com.github.zipcodewilmington.casino.games.Craps;


import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.RandomNumber;
import com.github.zipcodewilmington.utils.IOConsole;

public class CrapsGame extends Dice implements GameInterface {

    private int dice1;
    private int dice2;
    private int bet;
    int payout;//Matt


    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

    }

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
                    rollDice();
                    anySeven(dice1, dice2, bet);
                case 2:
                    bigSixAndEight(dice1, dice2,bet);
                case 3:
                    hardWays(dice1, dice2, bet);
                case 4:
                    oneRollBets(dice1, dice2, bet);
                case 5:
                    anyCrapsBet(dice1, dice2, bet);
            }
    }

    public void rollDice(){
        dice1 = randomNumberGenerator();
        dice2 = randomNumberGenerator();
    }


        public int anySeven(int d1, int d2, int wager){
        if(d1 == 2 && d2 == 5){
            return wager * 7;
        } else if (d1 == 5 && d2 == 2){
            return wager * 7;
        } else if (d1 == 4 && d2 == 3) {
            return wager * 7;
        } else if (d1 == 3 && d2 == 4) {
            return wager * 7;
        }else if (d1 == 1 && d2 == 6) {
            return wager * 7;
        } else if(d1 == 6 && d2 == 1){
            return wager * 7;
        }
        return 0;
    }

    public int bigSixAndEight(int d1, int d2, int wager){
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

    public int hardWays(int d1, int d2, int wager){
        if(d1 == 3 && d2 == 3 || d1 == 4 && d2 == 4){
            return wager * 9;
        }else if(d1 == 5 && d2 == 5 || d1 == 2 && d2 == 2){
            return wager * 7;
        }
        return -wager;

    }

    public int oneRollBets(int d1, int d2, int wager){
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

    public int anyCrapsBet(int d1, int d2, int wager){
        //2,3,12 7 to 1
        if(d1 == 1 && d2 == 1 || d1 == 1 && d2 == 2 ||
            d1 == 2 && d2 ==1 || d1 == 6 && d2 == 6){
            return wager * 7;
        }
        return - wager;
    }

    public boolean endGame(int wager) {
        return false;
    }
}
