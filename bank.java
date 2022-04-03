Scanner inpt=new Scanner(System.in);
System.out.println("Enter Your Account Number :");
public static int account=inpt.nextInt();
System.out.println("Press 1 for Credit, Press 2 for Withdraw, Press 3 for Exit.");
int balance=0
i=1
while i<6:
	System.out.print("What do you want to do ? :")
    choice=inpt.nextInt();
	switch(choice)
	{
    case 3:
        break;
    case 1:
		System.out.print("Enter Ammount Please :$");
        int ammount=inpt.nextInt();
        balance+=ammount;
		System.out.println("$"+ammount+" is credited successfully.");
		System.out.println("Now Your Total Balance is : $"+balance);
		break;
    case 2:
		System.out.print("Enter Ammount Please :$");
        int ammount=inpt.nextInt();
        if (ammount>balance)
		{
            System.out.println("Insufficient Balance !!!");
            break;
		}
        else
		{
            balance-=ammount;
            System.out.println(ammount+" is deducted successfully");
            if(balance==0)
			{
                System.out.println("Your Account Balance is Zero !!!");
                break;
			}
            else:
                System.out.println("Now your Remaining Balance is : $"+balance);
		}
		default:
			System.out.println("Invalid Selection !!!");
	}