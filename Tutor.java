import java.util.Date;

public class Tutor {
	private name Name;
	private String IC;
	private address Address;
	private int yearOfexp;
	private Date date_joined;
	private String background;
	
	public void setName(name Name) {
		this.Name = Name;
	}
	
	public name getname() {
		return Name;
	}
	
	public void setIC(String IC) {
		this.IC=IC;
	}
	
	public String getIC() {
		return IC;
	}
	
	public void setAddress(address Address) {
		this.Address = Address;
	}
	
	public address getAddress() {
		return Address;
	}
	
	public void setyearOfexp(int yearOfexp) {
		this.yearOfexp=yearOfexp;
	}
	
	public int getyearOfexp() {
		return yearOfexp;
	}
	
	public void setdate_joined(Date date_joined) {
		this.date_joined=date_joined;
	}
	
	public Date getdate_joined() {
		return date_joined;
	}
	
	public void setbackground(String background) {
		this.background=background;
	}
	
	public String getbackground() {
		return background;
	}

}
