package dmk.mapquest.model;

public class MapQuestInfo {
	
	protected int statuscode;
	protected String[] messages;
	
	public MapQuestInfo(){
		super();
	}
	
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String[] getMessages() {
		return messages;
	}
	public void setMessages(String[] messages) {
		this.messages = messages;
	}
}
