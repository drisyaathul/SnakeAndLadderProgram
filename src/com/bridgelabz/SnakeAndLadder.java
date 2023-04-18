package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {

    static final int winningPosition = 100;
    public static void main(String[] args) {
        System.out.println("*** Welcome to SNAKE AND LADDER PROGRAM ***");
        System.out.println();

        int firstPlayerPosition = 0;
        int secondPlayerPosition = 0;
        System.out.println("Player1 Starts at position = " + firstPlayerPosition);
        System.out.println("Player2 Starts at position = " + secondPlayerPosition);
        System.out.println();
        int count1 = 0;
        int count2 = 0;

        boolean currentTurn = true;
        while (firstPlayerPosition != winningPosition) {

            if (currentTurn == true) {

                Random random1 = new Random();
                int dice = random1.nextInt(6) + 1;
                System.out.println("Player1 rolls the die to get a number Randomly => " + dice);

                int option = random1.nextInt(3) + 1;
                switch (option) {
                    case 1:
                        System.out.println("NO PLAY");
                        System.out.println("The Player1 stays in the Same Position : " + firstPlayerPosition);
                        System.out.println();
                        currentTurn = false;
                        break;
                    case 2:
                        System.out.println("LADDER");
                        System.out.println("The Player1 moves ahead : " + (firstPlayerPosition + dice));
                        firstPlayerPosition += dice;
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("SNAKE");
                        System.out.println("The Player1 moves Behind : " + (firstPlayerPosition - dice));
                        firstPlayerPosition -= dice;
                        System.out.println();
                        currentTurn = false;
                        break;
                }
                count1++;

                if (firstPlayerPosition < 0) {
                    firstPlayerPosition = 0;
                }
                if (firstPlayerPosition > winningPosition) {
                    firstPlayerPosition -= dice;
                }

            } else {
                Random random2 = new Random();
                int dice = random2.nextInt(6) + 1;
                System.out.println("Player2 rolls the die to get a number Randomly => " + dice);

                int option = random2.nextInt(3) + 1;
                switch (option) {
                    case 1:
                        System.out.println("NO PLAY");
                        System.out.println("The Player2 stays in the Same Position : " + secondPlayerPosition);
                        System.out.println();
                        currentTurn = true;
                        break;
                    case 2:
                        System.out.println("LADDER");
                        System.out.println("The Player2 moves ahead : " + (secondPlayerPosition + dice));
                        secondPlayerPosition += dice;
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("SNAKE");
                        System.out.println("The Player2 moves Behind : " + (secondPlayerPosition - dice));
                        secondPlayerPosition -= dice;
                        System.out.println();
                        currentTurn = true;
                        break;
                }
                count2++;

                if (secondPlayerPosition < 0) {
                    secondPlayerPosition = 0;
                }
                if (secondPlayerPosition > winningPosition) {
                    secondPlayerPosition -= dice;
                }
            }
        }
        if (firstPlayerPosition == winningPosition) {
            System.out.println(" *** Player1 WON the Game *** ");
        }else {
            System.out.println(" *** Player2 WON the Game *** ");
        }
//        System.out.println();
//        System.out.println("Number Of times Player1 rolls the Dice  : " + count1);
//        System.out.println("Number Of times Player2 rolls the Dice  : " + count2);
    }
}

