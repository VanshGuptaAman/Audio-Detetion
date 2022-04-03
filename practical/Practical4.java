//WAP to test the prime number
import java.util.Scanner;
class Practical4
{
  public static void main(String args[])
    {
       int num,i,m=0;
       num=9;
       if(num==0||num==1)
         {
            m=0;
         }
       else
         {
         for(i=2;i<num;i++)
            {
               if(num%i==0)
                  {
			m=1;
                  }
            }
         }
	if(m==0)
	{
	System.out.print("Prime number");
	}
	if(m==1)
	{	
	System.out.print("Not prime number");
	}
      }
}