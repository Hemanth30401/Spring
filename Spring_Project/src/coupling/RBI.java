package coupling;

public class RBI 
{
	Bank bank;
	public RBI(Bank bank) {
		this.bank = bank;
	}
	public void getdata() {
		bank.interestRate();
	}
}
