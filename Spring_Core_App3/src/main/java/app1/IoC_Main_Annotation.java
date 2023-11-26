package app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoC_Main_Annotation {

	public static void main(String[] args) {
		ApplicationContext c = new AnnotationConfigApplicationContext(JavaConfig.class);
		Animal a = c.getBean("animal",Animal.class);
		a.getAnimals();
		System.out.println(a);
	}

}
