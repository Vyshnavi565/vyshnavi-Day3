package com.control_statemets;
import java.util.Scanner;
public class SumOfNPositiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n, m, i=1, cnt=0,sum=0;
		System.out.println("Enter the n value");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println("Enter the number");
			m=sc.nextInt();
			i++;
			if(m>=0)
			{
				cnt++;
				sum=sum+m;
			}
		}
		System.out.println("Number of positive numbers entered is " +cnt+" and the sum is " +sum);

	}

}
