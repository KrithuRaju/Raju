package com.demo.pojo;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Scheduletable")
public class Schedule {
	@Id
	@GeneratedValue
	private BigInteger scheduleId;
    private Airport srcAirport;
    private Airport dstnAirport;
    private String deptDateTime;
    private String arrDateTime;

    
    public BigInteger getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(BigInteger scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Airport getSrcAirport() {
		return srcAirport;
	}
	public void setSrcAirport(Airport srcAirport) {
		this.srcAirport = srcAirport;
	}
	public Airport getDstnAirport() {
		return dstnAirport;
	}
	public void setDstnAirport(Airport dstnAirport) {
		this.dstnAirport = dstnAirport;
	}
	public String getDeptDateTime() {
		return deptDateTime;
	}
	public void setDeptDateTime(String deptDateTime) {
		this.deptDateTime = deptDateTime;
	}
	public String getArrDateTime() {
		return arrDateTime;
	}
	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}
	
}
