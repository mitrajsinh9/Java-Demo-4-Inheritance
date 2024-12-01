package jDemo4inheritance;

import java.util.Scanner;
/* student
	no
	name
	setstudent
	pritnstudent

marks extends student
	eng,hindi
	setmarks
	printmarks
result extends marks
	printresult
		eng+hindi

r1.set set
print print print */

class student
{
	int sno;
	String sname;
	
	void setstudent()
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.print("Enter student no. =>");
			sno=sc.nextInt();
			
			System.out.print("Enter student name =>");
			sname=sc.next();
	}
	
	void printstudent()
	{
		System.out.println("Student no. = "+ sno + ";  Student name = "+ sname);
	}
	
}
class marks extends student //single inheritance
{
	int engmark,hinmark;
	
	void setmarks()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter english marks =>");
		engmark=sc.nextInt();
		
		System.out.print("Enter hindi marks=>");
		hinmark=sc.nextInt();
	}
	void printmarks()
	{
		System.out.println("English marks = " + engmark+ ";  Hindi marks = " + hinmark );
	}

}
class result extends marks
{
	void printresult()
	{
		System.out.println("Student Result = "+(engmark+hinmark));
	}
}
public class j2student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		result r1=new result();
		
		r1.setstudent();
		r1.setmarks();
		
		r1.printstudent();
		r1.printmarks();
		
		r1.printresult();
		
		
	}

}
