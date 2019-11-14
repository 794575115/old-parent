package org.old.ssm.entity;

import java.util.Date;

public class Check {

	private Integer id;
	private Integer year;
	private Integer month;
	private Integer day;
	private Date checkIn;
	private Date checkOut;
	private Integer empId;

	public Check() {
		super();
	}

	public Check(Integer id, Integer year, Integer month, Integer day, Date checkIn, Date checkOut, Integer empId) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.day = day;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Check [id=" + id + ", year=" + year + ", month=" + month + ", day=" + day + ", checkIn=" + checkIn
				+ ", checkOut=" + checkOut + ", empId=" + empId + "]";
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
