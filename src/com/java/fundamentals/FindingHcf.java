package com.java.fundamentals;

public class FindingHcf {

	public static void main(String[] args) {
		//========================================
//		int n1=20,n2=30;
//		int min=0;
//		int hcf=1;
//		if(n1<n2) {
//			min=n1;
//		}
//		else {
//			min=n2;
//		}
//		for(int i=min;i>=1;i--) {
//			if(n1%i==0 && n2%i==0) {
//				hcf=i;
//				break;
//			}
//			
//		}
//		System.out.println("Hcf is "+hcf);
//		int lcm=(n1*n2)/hcf;
//		System.out.println("Lcm is "+lcm);
		//==============================================
		
		//===============================================
//		int n1=12,n2=18;
//		int min=0;
//		int hcf=1;
//		if(n1<n2) {
//			min=n1;
//		}else {
//			min=n2;
//		}
//		for(int i=min;i>=1;i--) {    //n1*n2=lcf*hcf
//			if(n1%i==0 && n2%i==0) {
//				hcf=i;
//				break;
//			}
//		}
//		System.out.println("HCF is "+hcf);
//		int lcm=(n1*n2)/hcf;
//		System.out.println("Lcm is "+lcm);
		//====================================================
		
		//========================================
		//n1 =5 n2=10 hcf=5 lcm=30
//		int n1=20,n2=30,hcf=5,lcm=30;
//		if(n1*n2==hcf*lcm) {
//			System.out.println("Valid");
//		}else {
//			System.out.println("Not Valid");
//		}
		//=============================================
		
		//Ecluid Modulus: algo -->Hcf(a,b)=Hcf(b,a%b); until remainder = 0; a==b==hcf
		
		
		int a=70,b=90;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println(a);
		int lcm=(70*90)/a;
		System.out.println(lcm);
		
		

	}
	//n1*n2=hcf*lcm

}
