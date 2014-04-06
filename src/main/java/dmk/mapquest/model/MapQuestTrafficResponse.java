package dmk.mapquest.model;

public class MapQuestTrafficResponse {
	
	protected Incident[] incidents;
	protected String mqURL;
	protected Info info;
	
	public MapQuestTrafficResponse(){
		super();
	}

	public Incident[] getIncidents() {
		return incidents;
	}

	public void setIncidents(Incident[] incidents) {
		this.incidents = incidents;
	}

	public String getMqURL() {
		return mqURL;
	}

	public void setMqURL(String mqURL) {
		this.mqURL = mqURL;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}	
	
}