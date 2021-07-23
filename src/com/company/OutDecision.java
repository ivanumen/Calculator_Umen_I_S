package com.company;

public class OutDecision {
    public String in;
    OutDecision(String _in) {
        in = _in;
    }
    public String Out() {
        String[] mas = in.split(" ");
        if (mas[1].equals("+") && isNumber(mas[0]) && isNumber(mas[2])) {
            return Integer.toString(Operation.Sum(Integer.parseInt(mas[0]), Integer.parseInt(mas[2])));
        }

        if (mas[1].equals("-") && isNumber(mas[0]) && isNumber(mas[2])) {
            return Integer.toString(Operation.Sub(Integer.parseInt(mas[0]), Integer.parseInt(mas[2])));
        }

        if (mas[1].equals("*") && isNumber(mas[0]) && isNumber(mas[2])) {
            return Integer.toString(Operation.Mult(Integer.parseInt(mas[0]), Integer.parseInt(mas[2])));
        }

        if (mas[1].equals("/") && isNumber(mas[0]) && isNumber(mas[2])) {
            return Integer.toString(Operation.Div(Integer.parseInt(mas[0]), Integer.parseInt(mas[2])));
        }

        if (mas[1].equals("+") && isRomanNumber(mas[0]) && isRomanNumber(mas[2])) {
            return RomanNumbers.FromNumberToRoman(Operation.Sum(RomanNumbers.FromRomanToNumber(mas[0]), RomanNumbers.FromRomanToNumber(mas[2])));
        }

        if (mas[1].equals("-") && isRomanNumber(mas[0]) && isRomanNumber(mas[2])) {
            return RomanNumbers.FromNumberToRoman(Operation.Sub(RomanNumbers.FromRomanToNumber(mas[0]), RomanNumbers.FromRomanToNumber(mas[2])));
        }

        if (mas[1].equals("*") && isRomanNumber(mas[0]) && isRomanNumber(mas[2])) {
            return RomanNumbers.FromNumberToRoman(Operation.Mult(RomanNumbers.FromRomanToNumber(mas[0]), RomanNumbers.FromRomanToNumber(mas[2])));
        }

        if (mas[1].equals("/") && isRomanNumber(mas[0]) && isRomanNumber(mas[2])) {
            return RomanNumbers.FromNumberToRoman(Operation.Div(RomanNumbers.FromRomanToNumber(mas[0]), RomanNumbers.FromRomanToNumber(mas[2])));
        }
        return "Operation not found";
    }

    public static boolean isNumber(final String number) {
        return number.equals("1") || number.equals("2") || number.equals("3")  || number.equals("4") || number.equals("5") || number.equals("6") || number.equals("7")  || number.equals("8") || number.equals("9") || number.equals("10");
    }

    public static boolean isRomanNumber(final String number) {
        return number.equals("I") || number.equals("II") || number.equals("III")  || number.equals("IV") || number.equals("V") || number.equals("VI") || number.equals("VII")  || number.equals("VIII") || number.equals("IX") || number.equals("X");
    }

}
