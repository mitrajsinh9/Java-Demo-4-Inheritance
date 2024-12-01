package jDemo4inheritance;

import java.util.Scanner;

class usa
{
	int a;
	
	void setusa()
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.print("Enter usa value =>");
			a=sc.nextInt();
	}
	
	void printusa()
	{
		System.out.println("value = "+ a);
	}
	
}
class india extends usa //single inheritance
{
	int b;
	
	void setindia()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter india value =>");
		b=sc.nextInt();
	}
	void printindia()
	{
		System.out.println("value = " + b );
	}
	void multi()
	{
		System.out.println("A*B = " + (a*b));
	}
}


public class j1country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		india i1=new india();
		i1.setusa();
		i1.setindia();
		
		i1.printusa();
		i1.printindia();
		i1.multi();
	}

}
