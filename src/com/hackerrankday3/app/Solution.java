package com.hackerrankday3.app;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //Variable declaration
        int number = 0;
        //Object delcaration
        Scanner in = new Scanner(System.in);

        //Input
        number = in.nextInt();

        //Validates
        if( (number % 2 != 0) || ((number % 2 == 0) && (number >= 6 && number <= 20) ))
        {
            System.out.println("Weird");
        }
        else if(((number % 2 == 0) && (number >= 2 && number <= 5)) || ((number % 2 == 0) && number > 20))
        {
            System.out.println("Not Weird");
        }
    }
}
