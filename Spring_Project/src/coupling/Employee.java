package coupling;

public class Employee 
{
	private String Ename;
	private int Eid;
	Candidate c;
	
	public Employee(String Ename,int Eid,Candidate c)
	{
		this.Ename=Ename;
		this.Eid=Eid;
		this.c = c;
	}
	public String toString() {
		return Ename + " " + Eid + " " + c;
	}
}
