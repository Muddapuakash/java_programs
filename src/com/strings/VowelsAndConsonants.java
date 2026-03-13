package com.strings;

public class VowelsAndConsonants {

    public static int countVowels(String s) {
        int count = 0;
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String s) {
        int count = 0;
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'a' && ch[i] <= 'z') {
                if(!(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String s = "Akash";
        s = s.toLowerCase();

        System.out.println("Vowels: " + countVowels(s));
        System.out.println("Consonants: " + countConsonants(s));
    }
}