package coupling;

public class Tight_Coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
		u.calU();
	}

}
class User
{
	Product2 p = new Product2();
	public void calU() {
		p.getProd();
	}
}
class Product1
{
	public void getProd() {
		System.out.println("TV is sold");
	}
}
class Product2
{
	public void getProd() {
		System.out.println("Mobile is sold");
	}
}