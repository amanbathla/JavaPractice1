package com.stackroute.java;

import java.util.Arrays;

public class SortNumber {

    //Sort the number in non Assending order and check sum of even number is greater or less than 15

    public String SortNUmber(long Number){

        long sum = 0;

        String str = Number + "";
        char arrChar[] = str.toCharArray();
        Arrays.sort(arrChar);
        String sorted = new String(arrChar);
        int IncreasedOrder = Integer.parseInt(sorted);
        System.out.println("Sorted number in non-increasing order"+IncreasedOrder);

        while( Number != 0 )
        {
            long remainder = Number % 10;
            if(remainder % 2 == 0){
                sum = sum + remainder;
            }

            else{}
            Number  /= 10;
        }
        System.out.println("Sum of even numbers"+sum);
        if(sum > 15){

            return "True";
        }
        else{
            return "False";
        }

    }
}
