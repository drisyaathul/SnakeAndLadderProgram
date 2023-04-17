package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {

    static final int winningPosition = 100;     //UC4

    public static void main(String[] args) {
        System.out.println("*** Welcome to SNAKE AND LADDER PROGRAM ***");
        System.out.println();
//UC1
        int singlePlayerPosition = 0;
        System.out.println("Single Player Starts at position = " + singlePlayerPosition);
        System.out.println();
//UC4
        boolean currentTurn = true;
        while (singlePlayerPosition != winningPosition) {
            if (currentTurn == true) {

//UC2
                Random random = new Random();
                int dice = random.nextInt(6) + 1;
                System.out.println("Player rolls the die to get a number Randomly => " + dice);
//UC3
                int option = random.nextInt(3) + 1;
                switch (option) {
                    case 1:
                        System.out.println("NO PLAY");
                        System.out.println("The Player stays in the Same Position : " + singlePlayerPosition);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("LADDER");
                        System.out.println("The Player moves ahead : " + (singlePlayerPosition + dice));
                        singlePlayerPosition += dice;
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("SNAKE");
                        System.out.println("The Player moves Behind : " + (singlePlayerPosition - dice));
                        singlePlayerPosition -= dice;
                        System.out.println();
                        break;
                }
                if (singlePlayerPosition < 0 ) {
                    singlePlayerPosition = 0;
                }

            }
        }
        System.out.println("Single Player Reaches The Winning Position");
    }
}
