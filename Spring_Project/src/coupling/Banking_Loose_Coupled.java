package coupling;

public class Banking_Loose_Coupled 
{
	public static void main(String[] args) {
		Bank bank = new Hdfc();
		RBI rbi = new RBI(bank);
		rbi.getdata();
		
	}
}
