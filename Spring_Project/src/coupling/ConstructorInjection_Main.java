package coupling;

public class ConstructorInjection_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c = new Candidate("Chay",12);
		Employee e = new Employee("Hemanth",1,c);
		System.out.println(e.toString());

	}

}
