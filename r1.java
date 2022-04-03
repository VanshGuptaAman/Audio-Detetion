import java.util.Scanner;
class r1
{
    public static void main(String args[])
    {
        Scanner inpt=new Scanner(System.in);
        System.out.print("Enter number1 :");
        int input1=inpt.nextInt();
        System.out.print("Enter number2 :");
        int input2=inpt.nextInt();
        System.out.print("Enter number3 :");
        int input3=inpt.nextInt();
        int res1 = input1 * input2;
        int res2 = input1 * input3;
        int a1 = res1 + res2 - input3;
        int a2 = a1 % 10;
        int a3 = a1 / 10;
        int res3 = (a2 * 10) + a3;
        int result=(res1 * 10000) + (res2 * 100) + res3;
        System.out.println("Result is : "+result);
    }
}