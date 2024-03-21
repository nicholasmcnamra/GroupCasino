package com.github.zipcodewilmington.UtilTests;
import com.github.zipcodewilmington.utils.FileReader;
import org.junit.Test;
import org.junit.Assert;

import java.io.FileNotFoundException;

public class FileReaderTest {

    @Test
    public void fileReaderTest1() throws FileNotFoundException {
        FileReader fileReader = new FileReader();
        boolean actual = fileReader.readFile("username", "password");

        Assert.assertTrue(actual);
    }

    @Test
    public void fileReaderTest2() throws FileNotFoundException {
        FileReader fileReader = new FileReader();
        boolean actual = fileReader.readFile("Ali", "Bangash");

        Assert.assertTrue(actual);
    }

    @Test
    public void fileReaderTest3() throws FileNotFoundException {
        FileReader fileReader = new FileReader();
        boolean actual = fileReader.readFile("James", "Rocket");

        Assert.assertTrue(actual);
    }

}
