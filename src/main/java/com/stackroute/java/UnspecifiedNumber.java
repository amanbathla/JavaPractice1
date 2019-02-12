package com.stackroute.java;

public class UnspecifiedNumber {


    //Using String Enteted some list of numbers and add them

    public int unspecifiedInput(String userInput){

        int sum = 0;
        String number = "";
        for(int i=0;i<userInput.length(); i++){
            //System.out.println("i="+i +"userinput: "+ userInput.length());
            if(userInput.charAt(i) == ' ' && number != ""){
                sum = sum + Integer.parseInt(number);
                //System.out.println("sum:"+sum);
                number = "";
            }
            else if(userInput.charAt(i) >= 48 && userInput.charAt(i) <= 57){
                number = number + userInput.charAt(i);
                //System.out.println("number: "+number);
            }
            else
                System.err.println(userInput.charAt(i) + " is not a number!");

            if(i == (userInput.length() - 1) && number != "")
                sum = sum + Integer.parseInt(number);
        }
        //sum = sum + Integer.parseInt(number);
        return sum;

    }
}
