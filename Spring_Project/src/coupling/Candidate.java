package coupling;

public class Candidate 
{
	private String Cname;
	private int Cid;
	public Candidate(String cname, int cid) {
		super();
		Cname = cname;
		Cid = cid;
	}
	public String toString() {
		return Cname + " " + Cid; 
	}
}
