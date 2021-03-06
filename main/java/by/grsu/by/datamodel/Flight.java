package by.grsu.by.datamodel;

import java.io.Serializable;
import java.util.Date;

public class Flight extends AbstractModel implements Serializable {
	
	private Date date;
	private String name;
	private String status;	
	private Driver driver;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
}
