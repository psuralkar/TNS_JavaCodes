package com.Demo1;

public class firstProgram {
	public static void main(String[] args) {
		for(int i=1; i<=100;i++) {
		if(i%2==1 ){
			continue;
		}else {
			System.out.println(i);
		}
		if(i==50) {
			break;
		}
		}
	}
}
