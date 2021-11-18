package com.demo.pojo;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="scheuledflights table")

public class ScheduledFlights {
	@Id
	@GeneratedValue
	    private float flight;
	    private Integer availableSeats;
	    private Schedule schedule;

	   public BigInteger getScheduleFlightId() {
		return scheduleFlightId;
	}
	public void setScheduleFlightId(BigInteger scheduleFlightId) {
		this.scheduleFlightId = scheduleFlightId;
	}
	public float getFlight() {
		return flight;
	}
	public void setFlight(float flight) {
		this.flight = flight;
	}
	public Integer getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	private BigInteger scheduleFlightId;
	   
}
