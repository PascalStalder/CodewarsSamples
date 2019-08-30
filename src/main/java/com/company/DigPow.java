package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;

public class DigPow {

    private DigPow(){}

    public static long digPow(int number, int power) {
        double result = calcDigPow(number, power)/(double)number;
        if (result % 1 == 0){
            return (long) result;
        }
        return -1L;
    }

    public static long calcDigPow(int number, int power){
        List<Integer> digits = DigPow.intToDigits(number);
        int result = 0;
        int growingPower = power;
        for (int digit:digits){
            result += Math.pow(digit, growingPower);
            growingPower++;
        }
        return result;
    }

    private static List<Integer> intToDigits(int number){
        int temp = number;
        ArrayList<Integer> digits = new ArrayList<>();
        do{
            digits.add(temp % 10);
            temp /= 10;
        } while  (temp > 0);
        reverse(digits);
        return digits;
    }


}
