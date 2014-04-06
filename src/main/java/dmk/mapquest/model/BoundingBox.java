package dmk.mapquest.model;

public class BoundingBox {

	String bound1;
	String bound2;
	String bound3;
	String bound4;
	
	public BoundingBox(){
		super();
	}

	public String getBound1() {
		return bound1;
	}

	public void setBound1(String bound1) {
		this.bound1 = bound1;
	}

	public String getBound2() {
		return bound2;
	}

	public void setBound2(String bound2) {
		this.bound2 = bound2;
	}

	public String getBound3() {
		return bound3;
	}

	public void setBound3(String bound3) {
		this.bound3 = bound3;
	}

	public String getBound4() {
		return bound4;
	}

	public void setBound4(String bound4) {
		this.bound4 = bound4;
	}
	
	public static BoundingBox BALTIMORE;
	public static BoundingBox ANNAPOLIS;
	static{
		BALTIMORE = new BoundingBox();
		BALTIMORE.setBound1("39.503136");
		BALTIMORE.setBound2("-76.887259");
		BALTIMORE.setBound3("39.077998");
		BALTIMORE.setBound4("-76.337942");

		ANNAPOLIS = new BoundingBox();
		ANNAPOLIS.setBound1("39.191975");
		ANNAPOLIS.setBound2("-76.770529");
		ANNAPOLIS.setBound3("38.764949");
		ANNAPOLIS.setBound4("-76.221213");
	}
	
}
