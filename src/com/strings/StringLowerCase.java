package com.strings;

public class StringLowerCase {
	public static void Stringlowercase(String s ) {
		char[] ch=s.toCharArray();
		StringBuilder st=new StringBuilder();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				st.append((char)(ch[i]+32));
			}
			else {
				st.append(ch[i]);
			}
		}
		System.out.println(st.toString()    );
	}

	public static void main(String[] args) {
		String s="JAVA";
		Stringlowercase(s);
	}

}
