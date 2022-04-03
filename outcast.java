import java.util.Scanner;

class outcast
{
public static void main(String args[])
{
Scanner val = new Scanner(System.in);
System.out.println("Enter The Radius of Sphare :");
int r=val.nextInt();
float valume=(float)(4*22*r*r*r)/(3*7);
System.out.println(valume);
}
}