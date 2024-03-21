package com.github.zipcodewilmington.utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class FileReader {
    public static boolean readFile(String userName, String passWord) throws FileNotFoundException {
        boolean isInCSV = false;
        try {
            Scanner fileIn = new Scanner(new File("src/main/java/com/github/zipcodewilmington/casino/Accounts/TestAccountFile.csv"));

            while (fileIn.hasNext()) {
                String lineIn = fileIn.nextLine();
                String[] temp = lineIn.split(",");
                    if (temp[0].equals(userName) && temp[1].equals(passWord)) {
                        isInCSV = true;
                    }
                }
                // check to see if account data is different on file than what is stored in mainMenu.
                // if so, update account information with most recent file data
        } catch(IOException e) {
            System.out.println("File not found.");
        }
        return isInCSV;
    }

}
