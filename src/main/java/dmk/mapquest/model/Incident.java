package dmk.mapquest.model;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Incident {
    
	protected float delayFromFreeFlow;
    protected float delayFromTypical;
    protected String fullDesc;
    protected int severity;
    protected String lng;
    protected String shortDesc;
    protected int type;
    protected Date endTime;
    protected long id;
    protected Date startTime;
    protected float distance;
    protected boolean impacting;
    protected String[] tmcs;
    protected int eventCode;
    protected String iconURL;
    protected String lat;
    
    public Incident(){
    	super();
    }

	public float getDelayFromFreeFlow() {
		return delayFromFreeFlow;
	}

	public void setDelayFromFreeFlow(float delayFromFreeFlow) {
		this.delayFromFreeFlow = delayFromFreeFlow;
	}

	public float getDelayFromTypical() {
		return delayFromTypical;
	}

	public void setDelayFromTypical(float delayFromTypical) {
		this.delayFromTypical = delayFromTypical;
	}

	public String getFullDesc() {
		return fullDesc;
	}

	public void setFullDesc(String fullDesc) {
		this.fullDesc = fullDesc;
	}

	public int getSeverity() {
		return severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public boolean isImpacting() {
		return impacting;
	}

	public void setImpacting(boolean impacting) {
		this.impacting = impacting;
	}

	public String[] getTmcs() {
		return tmcs;
	}

	public void setTmcs(String[] tmcs) {
		this.tmcs = tmcs;
	}

	public int getEventCode() {
		return eventCode;
	}

	public void setEventCode(int eventCode) {
		this.eventCode = eventCode;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}
	
	public String getIconURL() {
		return iconURL;
	}

	public void setIconURL(String iconURL) {
		this.iconURL = iconURL;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(17, 71, this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
}