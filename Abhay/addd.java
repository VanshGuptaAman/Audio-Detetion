import java.util.Scanner;

class addd
{
public static void main(String args[])
{
 System.out.println("ADDITION");
 int num1;
 int num2; 
 Scanner sum=new Scanner(System.in);
 System.out.print("Enter First Number = ");
 num1=sum.nextInt();
 System.out.print("Enter Second Number = ");
 num2=sum.nextInt();

 int add=num1+num2;
 System.out.print("Addition is = "+add);

}



}