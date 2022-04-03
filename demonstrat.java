class demonstrat
{
public static void main(String args[])
{
int a=1;
int b=2;
int c=++b;
int d=a++;		//d=a
c++;
d++;
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}