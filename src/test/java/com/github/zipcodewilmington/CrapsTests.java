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
        int expected = 700;

        //When
        int actual = craps.anySeven(2, 5, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySeven2(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 700;

        //When
        int actual = craps.anySeven(5, 2, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySeven3(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 700;

        //When
        int actual = craps.anySeven(4, 3, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySeven4(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 700;

        //When
        int actual = craps.anySeven(3, 4, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySeven5(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 700;

        //When
        int actual = craps.anySeven(1, 6, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySeven6(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 700;

        //When
        int actual = craps.anySeven(6, 1, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnySevenLoss(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(1, 1, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
