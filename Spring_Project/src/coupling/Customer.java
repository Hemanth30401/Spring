package coupling;

public class Customer 
{
	private String Cname;
	private String Cid;
	private String items;
	public void setCid(String cid) {
		Cid = cid;
	}
	
	public String getCname() {
		return Cname;
	}
	public void setItems(String items) {
		this.items = items;
	}
	
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCid() {
		return Cid;
	}

	public String getItems() {
		return items;
	}
	
}
