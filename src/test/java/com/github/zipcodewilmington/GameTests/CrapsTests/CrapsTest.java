package com.github.zipcodewilmington.GameTests.CrapsTests;

import com.github.zipcodewilmington.casino.games.Craps.CrapsGame;
import org.junit.Assert;
import org.junit.Test;

public class CrapsTest {

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

    @Test
    public void testBigSixAndEight1(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 200;

        //When
        int actual = craps.anySeven(3, 3, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigSixAndEight2(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(5, 1, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigSixAndEight3(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(1, 5, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigSixAndEight4(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(4, 2, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigSixAndEight5(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(2, 4, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigSixAndEight6(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(1, 1, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigSixAndEight7(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(1, 1, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigSixAndEight8(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(1, 1, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigSixAndEight9(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(1, 1, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigSixAndEight10(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(1, 1, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigSixAndEightLoss(){
        //Given
        CrapsGame craps = new CrapsGame();
        int expected = 0;

        //When
        int actual = craps.anySeven(1, 1, 100);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
