package pack;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product 
{
	String name;
	@Id
	String code;
	int price;
	double quantity;
	
	
	public Product(String name, String code, int price, double quantity) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", code=" + code + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
