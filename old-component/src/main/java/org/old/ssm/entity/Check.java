package org.old.ssm.entity;

import java.util.Date;

public class Check {

	private Integer id;
	private Date checkDate;
	private Date checkIn;
	private Date checkOut;
	private Integer empId;

	public Check() {
		super();
	}

	public Check(Integer id, Date checkDate, Date checkIn, Date checkOut, Integer empId) {
		super();
		this.id = id;
		this.checkDate = checkDate;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Check [id=" + id + ", checkDate=" + checkDate + ", checkIn=" + checkIn + ", checkOut=" + checkOut
				+ ", empId=" + empId + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	

}
