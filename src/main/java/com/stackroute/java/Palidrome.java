package com.stackroute.java;

public class Palidrome {

    public String checkPalindrom(int a){

        int remainder = 0,reversedInteger = 0;
        int reverse = 0, sum = 0;
        int originalInteger = a;


        originalInteger = a;

        // reversed integer is stored in variable
        while( a != 0 )
        {
            remainder = a % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            a  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger){


            a = originalInteger;

            while( a != 0 )
            {
                remainder = a % 10;
                if(remainder % 2 == 0){
                    sum = sum + remainder;
                }

                else{}
                a  /= 10;
            }
            if(sum > 25){
                return "Given Number is Palindrome and sum of even digits is greater  than 25";
            }
            else{
                return "Given Number is Palindrome and sum of even digits is less than 25";
            }


        }

        else
            return "Given Number is not a Palindrome";


    }
}
