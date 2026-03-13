package com.strings;

public class DigitsLettersSpecial {

    public static void digitsLetters(String s) {

        int letters = 0;
        int digits = 0;
        int symbols = 0;

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (Character.isLetter(ch[i])) {
                letters++;
            }
            else if (Character.isDigit(ch[i])) {
                digits++;
            }
            else if (!Character.isWhitespace(ch[i])) {
                symbols++;
            }
        }

        System.out.println("Letters : " + letters);
        System.out.println("Digits : " + digits);
        System.out.println("Special Characters : " + symbols);
    }

    public static void main(String[] args) {

        String s = "akash is good boy 100 !@*";

        digitsLetters(s);
    }
}