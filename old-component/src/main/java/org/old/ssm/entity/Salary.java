package org.old.ssm.entity;

public class Salary {

	private Integer id;
	private Integer salaryYear;
	private Integer salaryMonth;
	private Double baseSalary;
	// 五险
	private Double insurance;
	// 公积金
	private Double accumulationFund;
	private Double tax;
	// 绩效(满勤奖励200,不满勤,没有200,还要扣除根据考勤数据对应的钱)
	private Double achievements;
	private Double reallySalary;
	private Integer empId;
	private Emp emp;

	public Salary() {
		super();
	}

	public Salary(Integer id, Integer salaryYear, Integer salaryMonth, Double baseSalary, Double insurance,
			Double accumulationFund, Double tax, Double achievements, Double reallySalary, Integer empId) {
		super();
		this.id = id;
		this.salaryYear = salaryYear;
		this.salaryMonth = salaryMonth;
		this.baseSalary = baseSalary;
		this.insurance = insurance;
		this.accumulationFund = accumulationFund;
		this.tax = tax;
		this.achievements = achievements;
		this.reallySalary = reallySalary;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", salaryYear=" + salaryYear + ", salaryMonth=" + salaryMonth + ", baseSalary="
				+ baseSalary + ", insurance=" + insurance + ", accumulationFund=" + accumulationFund + ", tax=" + tax
				+ ", achievements=" + achievements + ", reallySalary=" + reallySalary + ", empId=" + empId + ", emp="
				+ emp + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSalaryYear() {
		return salaryYear;
	}

	public void setSalaryYear(Integer salaryYear) {
		this.salaryYear = salaryYear;
	}

	public Integer getSalaryMonth() {
		return salaryMonth;
	}

	public void setSalaryMonth(Integer salaryMonth) {
		this.salaryMonth = salaryMonth;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Double getInsurance() {
		return insurance;
	}

	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}

	public Double getAccumulationFund() {
		return accumulationFund;
	}

	public void setAccumulationFund(Double accumulationFund) {
		this.accumulationFund = accumulationFund;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getAchievements() {
		return achievements;
	}

	public void setAchievements(Double achievements) {
		this.achievements = achievements;
	}

	public Double getReallySalary() {
		return reallySalary;
	}

	public void setReallySalary(Double reallySalary) {
		this.reallySalary = reallySalary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}
