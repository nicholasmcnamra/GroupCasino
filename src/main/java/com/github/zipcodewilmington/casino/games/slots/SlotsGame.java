package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.RandomNumber;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame implements RandomNumber, GameInterface {

    private String blockName;
    private int symbolOne;
    private int symbolTwo;
    private int symbolThree;

    @Override
    public void run() {
        setBlocks();
        getResult();
    }
    @Override
    public void add(PlayerInterface player) {
        SlotsPlayer slotsPlayer = new SlotsPlayer();
    }

    @Override
    public void remove(PlayerInterface player) {

    }

    public String switchSymbol(int symbol) {
        String result = "";
        switch(symbol) {
            case 1:
                result = "CHERRY";
                break;
            case 2:
                result = "LEMON";
                break;
            case 3:
                result = "ORANGE";
                break;
            case 4:
                result = "PLUM";
                break;
            case 5:
                result = "BELL";
                break;
            case 6:
                result = "BAR";
                break;
        }
        return result;
    }

    public String getResult() {
        setBlocks();
        String slotSymbolOne = switchSymbol(symbolOne);
        String slotSymbolTwo = switchSymbol(symbolTwo);
        String slotSymbolThree = switchSymbol(symbolThree);
        String result = slotSymbolOne + " " + slotSymbolTwo + " " + slotSymbolThree;
        System.out.println(result);
        return result;
    }
    public void setBlocks() {
        symbolOne = randomNumberGenerator();
        symbolTwo = randomNumberGenerator();
        symbolThree = randomNumberGenerator();
    }

    public int randomNumberGenerator() {
        return (int) (6.0 * Math.random() +1 );
    }
}
