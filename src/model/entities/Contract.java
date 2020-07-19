package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	
	private List<Installment> list = new ArrayList<>();
	
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
	public void addList(Installment instaloment) {
		list.add(instaloment);
	}
	public void removeList(Installment instaloment) {
		list.remove(instaloment);
	}
	
	
}
