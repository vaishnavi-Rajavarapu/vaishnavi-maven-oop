package EpamNewYearGift;
import java.util.*;
class MainGift
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> SweetWeights=new ArrayList<Integer>();
	ArrayList<Integer> ChocoWeights=new ArrayList<Integer>();
	//int minrange=0,maxrange=0;
	int item=0,choice=0;
	System.out.println("Enter the number of people attending the party:");
	int number_of_attendees=sc.nextInt();
	//System.out.println("Enter the minimum range of weights:");
	//minrange=sc.nextInt();
	//System.out.println("Enter the maximum range of weights:");
	//maxrange=sc.nextInt();
	while(item<3) {
		System.out.println("what do u want?\n1)sweets\n2)chocolates\n3)Exit\n Enter your choice:");
		item=sc.nextInt();
		if(item==1) {
			System.out.println("what type of sweet do you want?\n1)laddu\n2)gulab jamun\n3)jalebi\nEnter your option");
			choice=sc.nextInt();
			Sweets sweet=new Sweets();
			SweetWeights.add(sweet.weightcal(choice));
		}
		else if(item==2) {
			System.out.println("what type of sweet do you want?\n1)dairymilk\n2)snickers\nEnter your option");
			choice=sc.nextInt();
			Chocolates choco=new Chocolates();
			ChocoWeights.add(choco.weightcal(choice));
		}
		else
		{
			break;
		}
	}
	int size1=SweetWeights.size();
	int size2=ChocoWeights.size();
	for(int i=size1;i < number_of_attendees;i++)
	{
		SweetWeights.add(0);
	}
	for(int i=size2;i < number_of_attendees;i++)
	{
		ChocoWeights.add(0);
	}
	Collections.sort(ChocoWeights);
	System.out.println("The sorted order of chocolates is:\n");
	for(int i=0;i<number_of_attendees;i++)
	{
		System.out.println(ChocoWeights.get(i));
	}
	for(int i=0;i<number_of_attendees;i++)
	{
		int sum=SweetWeights.get(i)+ChocoWeights.get(i);
		if(sum>0 && sum<=10)
		{
			System.out.println("gift contains 5 candies");
		}
		else if(sum>10 && sum<=20)
		{
			System.out.println("gift contains 10 candies");
		}
		else if(sum>20)
		{
			System.out.println("gift contains 15 candies");
		}
		else
		{
			System.out.println("gift contains 0 candies.......");
		}
	}
	sc.close();
	}
}