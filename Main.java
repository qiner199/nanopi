package com;


import java.util.Scanner;



public class Main {
 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int number=0;
		for(int i=0;i<=n;i++) {
			if(ishui(i)) {
				number++;
			}
		}
		System.out.println(number);
		
	}
	public static boolean ishui(int a) {
		String string =Integer.toBinaryString(a);
		String re="";
		for(int i=string.length()-1;i>=0;i--) {
			re=re+string.charAt(i);
		}
		if(string.equals(re)) {
			return true;
		}else
			return false;
	}

}
