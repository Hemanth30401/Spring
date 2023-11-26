package app1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Lion implements Eat
{
	public void eat() {
		System.out.println("Lion eats Deer");
	}

}
