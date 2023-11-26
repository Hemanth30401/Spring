package app1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Tiger implements Eat
{
	public void eat() {
		System.out.println("Tiger eats meat");
		
	}

}
