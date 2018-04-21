package edu.progra2.loanMedinaDonayre.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Loan  implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer id;
	

	@NotNull
	
	private String name;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date loan_date;
	
	@NotNull
	private double original_amount;
	
	@NotNull
	private double rate;
	

	private double total_amount;
	

	private String status;
		
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLoan_date() {
		return loan_date;
	}
	public void setLoan_date(Date loan_date) {
		this.loan_date = loan_date;
	}
	public double getOriginal_amount() {
		return original_amount;
	}
	public void setOriginal_amount(double original_amount) {
		this.original_amount = original_amount;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
