package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("*** Welcome to SNAKE AND LADDER PROGRAM ***");
//UC1
        System.out.println("Lets Start the Game SNAKE AND LADDER");
        int singlePlayerPosition = 0;
        System.out.println("Single Player Start At Position Zero");
//UC2
        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Player rolls the die to get a number Randomly => "+dice);
    }
}
