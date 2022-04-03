//WAP to calculate the simple interest and input by users. 
import java.util.Scanner;
class Practical5
{
  public static void main(String args[])
    {
		Scanner inpt=new Scanner(System.in);
		int pamm,rate,time;
		float interest;
		System.out.print("Enter The Principal Ammount = ");
		pamm=inpt.nextInt();
		System.out.print("Enter The Rate of Interest = ");
		rate=inpt.nextInt();
		System.out.print("Enter The Time = ");
		time=inpt.nextInt();
		interest=(float)pamm*rate*time/100;
       System.out.println("Interest is="+interest);
      }
}