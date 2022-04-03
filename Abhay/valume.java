import java.util.Scanner;
class valume
{
public static void main(String args[])
{
 System.out.println("VALUME OF A SPHERE");
 int r;
 Scanner sphere=new Scanner(System.in);
 System.out.print("Input the Radius of Sphere = ");
 r=sphere.nextInt();
 double val=(4*3.14*r*r*r)/3;
 System.out.print("Valume of a Sphere = "+val);
}

}