package com.strings;

public class ReverseString {
    public static String StringReverse(String s) {
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String r = "raju";
        System.out.println(ReverseString.StringReverse(r));
    }
}