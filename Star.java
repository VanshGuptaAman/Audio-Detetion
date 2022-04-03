import java.util.Scanner;

import java.util.concurrent.TimeUnit;
public class Star
{
	public static void main(String[] args)
	{
		Scanner inpt=new Scanner(System.in);
		int n,r,space,i,m=1;
		System.out.print("Enter the number of upper rows :");
		n=inpt.nextInt();
		for(r=1;r<=n;r++)
		{
			for(space=1;space<=n-r;space++)
			{
				System.out.print(" ");
			}
			if(r==1)
			{
				System.out.print("*\n");
			}
			else
			{
				System.out.print("*");
				for(i=1;i<=m;i++)
				{
						System.out.print(" ");
				}
				System.out.print("*\n");
				m+=2;
			}
		}
		TimeUnit ina=new TimeUnit();
        ina.SECONDS.sleep(1);
		m-=4;
		for(r=1;r<n;r++)
		{
			for(space=1;space<=r;space++)
			{
				System.out.print(" ");
			}
			if(r==n-1)
			{
				System.out.print("*\n");
			}
			else
			{
				System.out.print("*");
				for(i=1;i<=m;i++)
				{
						System.out.print(" ");
				}
				System.out.print("*\n");
				m-=2;
			}
		}
		
	}
} 
