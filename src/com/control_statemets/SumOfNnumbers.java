package com.control_statemets;
import java.util.Scanner;
public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n, i=0, m, sum=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		while(i<n)
		{
			System.out.println("Enter the number");
			m=sc.nextInt();
			sum=sum+m;
			i++;
		}
		System.out.println("The sum is " +sum);

	}

}
