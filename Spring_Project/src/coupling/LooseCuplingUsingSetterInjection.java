package coupling;

public class LooseCuplingUsingSetterInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application1 a = new Product23();
		User2 u = new User2();
		u.setProd(a);
		u.calU();
		
	}

}
class User2
{
	Application1 app = null;
	public void setProd(Application1 app)
	{
		this.app=app;
	}
	public void calU() {
		app.getProd();
	}
}

interface Application1
{
	public void getProd();
}

class Product22 implements Application1
{
	public void getProd() {
		System.out.println("TV is sold");
	}
}
class Product23 implements Application1
{
	public void getProd() {
		System.out.println("Mobile is sold");
	}
}