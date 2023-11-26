package app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("animal")
public class Animal 
{
	private String Aname;
	private double Aweight;
	
	@Autowired
	public Cow cow;
	@Autowired
	public Dog dog;
	
	@Autowired
	@Qualifier("lion")
	public Eat eat;
	
	@Value("${animal.Aname}")
	public void setAname(String aname) {
		Aname = aname;
	}

	@Value("${animal.Aweight}")
	public void setAweight(double aweight) {
		Aweight = aweight;
	}

	public void setCow(Cow cow) {
		this.cow = cow;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public void setEat(Eat eat) {
		this.eat = eat;
	}
	
	public void getAnimals() {
		cow.cowData();
		dog.dogData();
		eat.eat();
	}

	@Override
	public String toString() {
		return "Animal [Aname=" + Aname + ", Aweight=" + Aweight + "]";
	}
	
	
	
}
