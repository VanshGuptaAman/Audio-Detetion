class Alphabate
{
    public static void main(String args[])
    {
        character obj=new character();
        obj.A();
    }
}

class character
{
    void A()
    {
        int n=4,r,space,i,m=1;
        for(r=1;r<=n;r++)
		{
			for(space=1;space<=(n+4)-r;space++)
			{
				System.out.print(" ");
			}
			if(r==1)
			{
				System.out.print("*\n");
			}
			else
			{
				System.out.print("*");
				for(i=1;i<=m;i++)
				{
						System.out.print(" ");
				}
				System.out.print("*\n");
				m+=2;
			}
        }
        System.out.println("   * * * * *");
        for(r=2;r<=n;r++)
		{
			for(space=1;space<=n-r;space++)
			{
				System.out.print(" ");
			}
            System.out.print("*");
            for(i=1;i<=m+2;i++)
            {
                    System.out.print(" ");
            }
            System.out.print("*\n");
            m+=2;     
		}
    }
    void B()
    {
        
    }
}