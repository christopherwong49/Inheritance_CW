package Utilities;

import java.util.Scanner;

public class Library {
    public static Scanner input = new Scanner(System.in);
    //nextInt()    nextDouble()    nextBoolean()    nextLine()    next()

    public static int myRandom (int min, int max){
        int num =  (int) (Math.random() * (max - min + 1)   + min);
        return num;
    }
}