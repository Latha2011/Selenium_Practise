package org.practise.sel.browser;

import java.util.Scanner;

public class Polyndrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int rev=0;
		System.out.println("Enter a number to check polyndrome:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y= x;
		
		while(x!=0)
		{
			rev=rev*10+ x%10;
			x=x/10;
		}
       // System.out.println(rev);
        if(rev==y)
        {
        	System.out.println(y+" is a polyndrome");
        }
        else
        {
        	System.out.println(y+"  is not a polyndrome");
        }
        sc.close();
	}

}
