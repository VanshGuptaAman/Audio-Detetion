import java.util.Scanner;

public class College
{
	public static void main(String args[])
	{
		int i=0;
		stud obj=new stud();
		//while(i)
		//{
			obj.EnterData();
			obj.FindAvg();
		//	i++;
	//	}
	//	for (i=0;i<=4;i++)
	//	{
			obj.Display();
	//	}
	}
}

class stud
{
	private
		String name,fname;
		int m1,m2,m3,m4,m5,avg,total;
	public
		Scanner inpt=new Scanner(System.in);
		void EnterData()
		{
			System.out.print("Name : ");
			name=inpt.next();
			System.out.print("Father's Name : ");
			fname=inpt.next();
			System.out.println("Enter Your Marks");
			System.out.print("Hindi : ");
			m1=inpt.nextInt();
			System.out.print("English : ");
			m2=inpt.nextInt();
			System.out.print("Maths : ");
			m3=inpt.nextInt();
			System.out.print("Science : ");
			m4=inpt.nextInt();
			System.out.print("SST : ");
			m5=inpt.nextInt();
		}
		void FindAvg()
		{
			total=m1+m2+m3+m4+m5;
			avg=total/5;
		}
		void Display()
		{
			System.out.print(name+"\t"+fname+"\t Sum = "+total+"\t Average = "+avg);
		}
}

class data1
{
	
}