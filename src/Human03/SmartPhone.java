package Human03;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String Company,String os) {
		this.company = company;
		this.os = os;
	}
	public String toString() {
		return (this.company + "-" + this.os);
	}
	
}
