package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		ApplicationContext c = new ClassPathXmlApplicationContext("Config.xml");
		ProductDao pd = c.getBean("productDao",ProductDao.class);
		Product p = new Product("TV","T",12,20000.01);
		pd.insertData(p);
		System.out.println("Inserted Successfully");

	}

}
