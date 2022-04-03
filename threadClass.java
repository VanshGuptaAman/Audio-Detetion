public class threadClass
{
	public static void main(String args[])
	{
		A a=new A();
		a.start();
		B b=new B();
		b.start();
		C c=new C();
		c.start();
		
	}
}


class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("From Thread A :"+i);
		}
		System.out.println("Out of thread A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("From Thread B :"+j);
			if(j==3)
			try
			{
				sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println("\rWhen i am Thread B :j="+j);
				
			}
		}
		System.out.println("Out of thread B");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("From Thread C :"+k);
		}
		System.out.println("Out of thread C");
	}
}
