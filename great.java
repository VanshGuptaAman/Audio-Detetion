import java.util.Scanner;

class great
{
public static void main(String args[])
{
int num1;
int num2;
int num3;
Scanner great = new Scanner(System.in);
System.out.println("Enter First Number :");
num1=great.nextInt();
System.out.println("Enter Second Number :");
num2=great.nextInt();
System.out.println("Enter Third Number :");
num3=great.nextInt();

if (num1>num2)
{
	if (num1>num3)
	System.out.println(num1 + " is greatest number.");
	else
	System.out.println(num3 + " is greatest number.");
}
else
{
	if (num2>num3)
	System.out.println(num2 + " is greatest number.");
	else
	System.out.println(num3 + " is greatest number.");
}
}
}