package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum=0;
		int average=0;
		int[] data = new int[5];
		data[0] = num;
		data[1] = num;
		data[2] = num;
		data[3] = num;
		data[4] = num;
		
		
		for(int i=0; i<data.length; i++) {
			num = sc.nextInt();
			if(i<data.length) {
				sum=sum+num;
				average=sum/5;	
			}
		}
		System.out.println("평균은 "+average+" 입니다.");
		
		sc.close();
	}

}
