package com.github.zipcodewilmington.utils;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public void readFile() {

        try {
            Scanner fileIn = new Scanner(new File("Casino_Accounts.csv"));

            while (fileIn.hasNext()) {
                String lineIn = fileIn.nextLine();
                // check to see if account data is different on file than what is stored in mainMenu.
                // if so, update account information with most recent file data
            }
        } catch(IOException e) {
            System.out.println("File not found.");
        }
    }

}
