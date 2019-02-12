package com.stackroute.java;

public class TomJerry {

    //Check Tom jerry
    public String checkTomJerry(int a){
        if((a > 20) && (a < 30)){
            if(a%2 == 0)
                return  "Jerry";
            else
                return  "Tom";

        }
        else{
            return "";
        }
    }

}
