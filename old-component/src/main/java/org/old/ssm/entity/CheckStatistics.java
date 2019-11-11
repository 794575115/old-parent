package org.old.ssm.entity;

public class CheckStatistics {

	private Integer id;
	private Integer statisticsYear;
	private Integer statisticsMonth;
	private Integer lateCount;
	private Integer leaveearlyCount;
	private Integer absenteeismCount;
	private Integer absenteeismhalfCount;
	private Integer empId;

	public CheckStatistics() {
		super();
	}

	public CheckStatistics(Integer id, Integer statisticsYear, Integer statisticsMonth, Integer lateCount,
			Integer leaveearlyCount, Integer absenteeismCount, Integer absenteeismhalfCount, Integer empId) {
		super();
		this.id = id;
		this.statisticsYear = statisticsYear;
		this.statisticsMonth = statisticsMonth;
		this.lateCount = lateCount;
		this.leaveearlyCount = leaveearlyCount;
		this.absenteeismCount = absenteeismCount;
		this.absenteeismhalfCount = absenteeismhalfCount;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "CheckStatistics [id=" + id + ", statisticsYear=" + statisticsYear + ", statisticsMonth="
				+ statisticsMonth + ", lateCount=" + lateCount + ", leaveearlyCount=" + leaveearlyCount
				+ ", absenteeismCount=" + absenteeismCount + ", absenteeismhalfCount=" + absenteeismhalfCount
				+ ", empId=" + empId + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStatisticsYear() {
		return statisticsYear;
	}

	public void setStatisticsYear(Integer statisticsYear) {
		this.statisticsYear = statisticsYear;
	}

	public Integer getStatisticsMonth() {
		return statisticsMonth;
	}

	public void setStatisticsMonth(Integer statisticsMonth) {
		this.statisticsMonth = statisticsMonth;
	}

	public Integer getLateCount() {
		return lateCount;
	}

	public void setLateCount(Integer lateCount) {
		this.lateCount = lateCount;
	}

	public Integer getLeaveearlyCount() {
		return leaveearlyCount;
	}

	public void setLeaveearlyCount(Integer leaveearlyCount) {
		this.leaveearlyCount = leaveearlyCount;
	}

	public Integer getAbsenteeismCount() {
		return absenteeismCount;
	}

	public void setAbsenteeismCount(Integer absenteeismCount) {
		this.absenteeismCount = absenteeismCount;
	}

	public Integer getAbsenteeismhalfCount() {
		return absenteeismhalfCount;
	}

	public void setAbsenteeismhalfCount(Integer absenteeismhalfCount) {
		this.absenteeismhalfCount = absenteeismhalfCount;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}
