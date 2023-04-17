package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {
        System.out.println("*** Welcome to SNAKE AND LADDER PROGRAM ***");
        System.out.println();
//UC1
        System.out.println("Lets Start the Game SNAKE AND LADDER");
        int singlePlayerPosition = 0;
        System.out.println("Single Player Start At Position Zero");
//UC2
        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Player rolls the die to get a number Randomly => "+dice);
//UC3
        int option = random.nextInt(3)+1;
        switch (option){
            case 1:
                System.out.println("NO PLAY" );
                System.out.println("The Player stays in the Same Position : "+singlePlayerPosition);
                break;
            case 2:
                System.out.println("LADDER");
                System.out.println("The Player moves ahead : "+(singlePlayerPosition+dice));
                break;
            case 3:
                System.out.println("SNAKE");
                System.out.println("The Player moves Behind : " +(singlePlayerPosition-dice));
                break;
        }
    }
}
