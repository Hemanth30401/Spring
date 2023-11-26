package coupling;

public class DependencyInjection_LooseCoupled 
{
	public static void main(String[] args) {
		Orders o = new Orders();
		Customer c = new Customer();
		o.setC(c);
		o.getC().setCname("Sai");
		System.out.println(o.getC().getCname());
		o.getC().setCid("12");
		System.out.println(o.getC().getCid());
		o.setProd("Mobile");
		System.out.println(o.getProd());
//		o.getData();
		
		
	}
}

