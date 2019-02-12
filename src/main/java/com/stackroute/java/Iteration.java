package com.stackroute.java;

public class Iteration {

    //Iteration of Numbers

    public String Iteration(int Iteration){
        String str = "";
        for(int i = 0; i<= Iteration ; i++){
            for (int j = 0;j<i;j++){
                str = str+i;
            }
        }

        return str;
    }

}
