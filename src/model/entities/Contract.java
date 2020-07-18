package model.entities;

import java.util.Date;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	
	public Contract(Integer number, Date date, Double totalValue) {		
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getNumber() {
		return number;
	}
	public Double getTotalValue() {
		return totalValue;
	}
	
	
}
