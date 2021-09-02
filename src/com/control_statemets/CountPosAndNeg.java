package com.control_statemets;
import java.util.Scanner;
public class CountPosAndNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n, m, i=1, cnt=0, cnt1=0;
		System.out.println("Enter the n value");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println("ENter the number");
			m=sc.nextInt();
			i++;
			if(m>=0)
			{
				cnt++;
			}
			else if(m<=0)
			{
				cnt1++;
			}
		}
		System.out.println("Number of positive integers entered is " +cnt+ " and Number of negative integers entered is " +cnt1);

	}

}
