package com.stackroute.java;

public class GuessNumber {

    //Guess the Number between a limit

    public int GuessNumber(int Number){
        int checkNum = 25;

        if(Number < checkNum){
            System.out.println("Number guessed is less than original number ");
            return 1;
        }
        else if(Number > checkNum){
            System.out.println("Number guessed is more than original number ");
            return 2;
        }
        else{
            System.out.println("Number guessed matched the original number ");
            return 3;
        }
    }

}
