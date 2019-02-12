package com.stackroute.java;

public class CheckCharacter {

    //check for Character i.e Digit,Alphabet or character

    public String checkCharacter(char ch){

        if(ch >= 'a' && ch <= 'z'){
            return "small letter";

        }
        else if(ch >= 'A' && ch <= 'Z'){
            return "Capital Letter";

        }
        else if( ch >= '0' && ch <= '9')
        {
            return "Digits";

        }
        else if(ch ==' '){
            return null;
        }

        else{
            return "Special Character";
        }

    }

}
