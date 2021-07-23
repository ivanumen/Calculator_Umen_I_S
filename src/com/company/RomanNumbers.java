package com.company;

public class RomanNumbers {
    public static int FromRomanToNumber(final String romanNumber) {
        if (romanNumber.equals("I")) {
            return 1;
        }
        if (romanNumber.equals("II")) {
            return 2;
        }
        if (romanNumber.equals("III")) {
            return 3;
        }
        if (romanNumber.equals("IV")) {
            return 4;
        }
        if (romanNumber.equals("V")) {
            return 5;
        }
        if (romanNumber.equals("VI")) {
            return 6;
        }
        if (romanNumber.equals("VII")) {
            return 7;
        }
        if (romanNumber.equals("VIII")) {
            return 8;
        }
        if (romanNumber.equals("IX")) {
            return 9;
        }
        if (romanNumber.equals("X")) {
            return 10;
        }
        return 0;
    }
    public static String FromNumberToRoman(int number){
        String ans = "";
        if (number == 0) {
            ans += "Not zero from Roman Numbers";
        }
        if (number == 100) {
            number -= 100;
            ans += "C";
        }
        if (number >= 90) {
            number -= 90;
            ans += "XC";
        }
        if (number >= 80) {
            number -= 80;
            ans += "LXXX";
        }
        if (number >= 70) {
            number -= 70;
            ans += "LXX";
        }
        if (number >= 60) {
            number -= 60;
            ans += "LX";
        }
        if (number >= 50) {
            number -= 50;
            ans += "L";
        }
        if (number >= 40) {
            number -= 40;
            ans += "XL";
        }
        if (number >= 30) {
            number -= 30;
            ans += "XXX";
        }
        if (number >= 20) {
            number -= 20;
            ans += "XX";
        }
        if (number >= 10) {
            number -= 10;
            ans += "X";
        }
        if (number == 9) {
            number -= 9;
            ans += "IX";
        }
        if (number == 8) {
            number -= 8;
            ans += "VIII";
        }
        if (number == 7) {
            number -= 7;
            ans += "VII";
        }
        if (number == 6) {
            number -= 6;
            ans += "VI";
        }
        if (number == 5) {
            number -= 5;
            ans += "V";
        }
        if (number == 4) {
            number -= 4;
            ans += "IV";
        }
        if (number == 3) {
            number -= 3;
            ans += "III";
        }
        if (number == 2) {
            number -= 2;
            ans += "II";
        }
        if (number == 1) {
            number -= 1;
            ans += "I";
        }
        if (number == -9) {
            number += 9;
            ans += "-IX";
        }
        if (number == -8) {
            number += 8;
            ans += "-VIII";
        }
        if (number == -7) {
            number += 7;
            ans += "-VII";
        }
        if (number == -6) {
            number += 6;
            ans += "-VI";
        }
        if (number == -5) {
            number += 5;
            ans += "-V";
        }
        if (number == -4) {
            number += 4;
            ans += "-IV";
        }
        if (number == -3) {
            number += 3;
            ans += "-III";
        }
        if (number == -2) {
            number += 2;
            ans += "-II";
        }
        if (number == -1) {
            number += 1;
            ans += "-I";
        }
        return ans;
    }
}
