package EpamNewYearGift;
interface Choco
{
	int weightcal(int n);
}
public class Chocolates implements Choco
{
	public int weightcal(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 11;
		else if(n==2)
			return 27;
		else
			return 0;
	}
}

