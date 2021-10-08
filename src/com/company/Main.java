package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

   /* Random random = new Random();
    System.out.println("First Random int is " + random.nextInt(10));
    System.out.println("First Random double is " + random.nextDouble());

    int min = 5;
    int max = 10;
    int newRandom = random.nextInt((max -min) + 1) + min;
    System.out.println(newRandom);

    System.out.println(Math.random());
    int rand = (int)(Math.random()*10);
    System.out.println(rand);
*//*
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Enter a number:");
    int userNum = input.nextInt();

    System.out.println("Enter a minimum:");
    int userMin = input.nextInt();
    System.out.println("Enter a maximum:");
    int userMax = input.nextInt();

    for (i = userNum;){

        System.out.println(random.nextInt((userMax - userMin) + 1) + userMin);
    }*/

        // https://www.w3schools.com/java/java_hashmap.asp

        Scanner input = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int diceSides = input.Scanner(System.in);
        System.out.println("How many times do you want to throw your dice?");
        int diceThrows = input.Scanner(System.in);

        Random randomThrow = new Random();


        HashMap<Integer, Integer> tally = new HashMap<Integer, Integer>();







    }
}
