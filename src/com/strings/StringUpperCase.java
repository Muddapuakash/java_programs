package com.strings;

public class StringUpperCase {

    public static void StringupperCase(String s) {
        char[] ch = s.toCharArray();
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= 'a' && ch[i] <= 'z') {
                st.append((char)(ch[i] - 32));
            } else {
                st.append(ch[i]);
            }

        }

        System.out.println(st.toString());
    }

    public static void main(String[] args) {
        String a = "java";
        StringupperCase(a);
    }
}