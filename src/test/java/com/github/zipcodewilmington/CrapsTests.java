package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.Craps.CrapsGame;
import com.github.zipcodewilmington.casino.games.Craps.Dice;
import org.junit.Assert;
import org.junit.Test;


public class CrapsTests {

    @Test
    public void testAnySeven1(){
        //Given
        CrapsGame craps = new CrapsGame();
        int d1 = 2;
        int d2 = 5;
        int expected = 700;

        //When
        int actual = craps.anySeven(100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySeven2(){
        //Given
        CrapsGame craps = new CrapsGame();
        int d1 = 5;
        int d2 = 2;
        int expected = 700;

        //When
        int actual = craps.anySeven(100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySeven3(){
        //Given
        CrapsGame craps = new CrapsGame();
        int d1 = 4;
        int d2 = 3;
        int expected = 700;

        //When
        int actual = craps.anySeven(100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySeven4(){
        //Given
        CrapsGame craps = new CrapsGame();
        int d1 = 3;
        int d2 = 4;
        int expected = 700;

        //When
        int actual = craps.anySeven(100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySeven5(){
        //Given
        CrapsGame craps = new CrapsGame();
        int d1 = 1;
        int d2 = 6;
        int expected = 700;

        //When
        int actual = craps.anySeven(100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySeven6(){
        //Given
        CrapsGame craps = new CrapsGame();
        int d1 = 6;
        int d2 = 1;
        int expected = 700;

        //When
        int actual = craps.anySeven(100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySevenLoss(){
        //Given
        CrapsGame craps = new CrapsGame();
        int d1 = 1;
        int d2 = 1;
        int expected = -100;

        //When
        int actual = craps.anySeven(100);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
