package com.katasinjava.katas;

public class FizzBuzz {
    public String FizzBuzz (Integer number){
        if(number % 3 == 0 && number %5 == 0){
            return "FizzBuzz";
        } else if (number %3 == 0) {
            return "Fizz";
        } else if (number %5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }

}
