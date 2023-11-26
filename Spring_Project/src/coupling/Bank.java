package coupling;

public interface Bank 
{
	public void interestRate();
}
class Union implements Bank
{

	@Override
	public void interestRate() {
		// TODO Auto-generated method stub
		System.out.println("Intrest rate is 20%");
	}
	
}
class Hdfc implements Bank
{

	@Override
	public void interestRate() {
		// TODO Auto-generated method stub
		System.out.println("Intrest rate is 10%");
	}
	
}

