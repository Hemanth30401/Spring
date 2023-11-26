package coupling;

public class Orders 
{
	private String prod;
	private int price;
	private Customer c;
	public String getProd() {
		return prod;
	}
	public void setProd(String prod) {
		this.prod = prod;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	public void  getData() {
		System.out.println(c.getCname() + " " + c.getCid() + " " + c.getItems());
	}
	
	
}
