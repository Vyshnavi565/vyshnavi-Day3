package com.control_statemets;
import java.util.Scanner;
public class Print2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a, b;
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		while(a>=b)
		{
			System.out.println(a);
			a--;
		}
		
	}

}
