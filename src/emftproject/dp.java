package emftproject;
import java.io.*;
import java.util.*;
public class dp {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		//System.out.println(fib(n));
		//System.out.println(fibm(n,new int [n+1]));
	    fibt(n);
	}
	public static int fib(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		System.out.println("hii"+n);
		int f1=fib(n-1);
		int f2=fib(n-2);
		int f=f1+f2;
		return f;
	}
	public static int fibm(int n, int qb[])
	{
		if(n==0||n==1)
		{
			return n;
		}
		if(qb[n]!=0)
		{
			return qb[n];
		}
		System.out.println("hii"+n);
		int f1=fibm(n-1,qb);
		int f2=fibm(n-2,qb);
		int f=f1+f2;
		qb[n]=f;
		return f;
	}
	public static void fibt(int n)
	{
		int qb[]=new int[n+1];
		qb[0]=0;
		qb[1]=1;
		for(int i=2;i<=n;i++)
		{
			qb[i]=qb[i-1]+qb[i-2];
		}
		System.out.println(qb[n]);
		
	}

}
