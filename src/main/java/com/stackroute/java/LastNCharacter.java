package com.stackroute.java;

public class LastNCharacter {

    //Print last n character n-times java

    public String printLastNCharacterNtimes(String str,int n){
        int strLen = str.length();
        String finalString = str;

        //If String Length is equal to n

        if (strLen == n) {

            for(int i= 0;i<n;i++){
                finalString = finalString + finalString;
            }


        }
        //If String length is less then n

        else if (strLen > n) {
            String substr =  str.substring(str.length()-n);

            for(int i= 0; i<n; i++) {
                finalString = finalString + substr;
            }


        }
        return finalString;
    }
}
