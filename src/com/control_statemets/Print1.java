package com.control_statemets;
import java.util.Scanner;
public class Print1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, m;
		System.out.println("Enter the value of a");
		n=sc.nextInt();
		System.out.println("Enter the value of b");
		m=sc.nextInt();
		while(n<=m)
		{
			System.out.println(n);
			n++;
		}

	}

}
