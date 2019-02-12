package com.stackroute.java;

public class CheckConsonent {



    public String checkVowelConsonent(String line) {

        line = line.toLowerCase();

        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                System.out.print("Vowel \t");
                return "Vowel";

            } else if ((ch >= 'a' && ch <= 'z')) {
                System.out.print("Consonent \t");
                return "Consonent";

            } else if (ch >= '0' && ch <= '9') {
                System.out.print("Error not a character \t");
                return "Consonent";
            } else if (ch >= '0' && ch <= '9') {
                System.out.print("Digit");
                return "Consonent";
            } else {
                return "";
            }
        }
        return null;

    }

}
