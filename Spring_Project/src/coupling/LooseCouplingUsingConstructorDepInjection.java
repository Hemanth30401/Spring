package coupling;

public class LooseCouplingUsingConstructorDepInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app = new Product12();
		User1 u = new User1(app);
		u.calU();
	}

}

class User1
{
	Application app = null;
	User1(Application app)
	{
		this.app=app;
	}
	public void calU() {
		app.getProd();
	}
}

interface Application
{
	public void getProd();
}

class Product12 implements Application
{
	public void getProd() {
		System.out.println("TV is sold");
	}
}
class Product13 implements Application
{
	public void getProd() {
		System.out.println("Mobile is sold");
	}
}