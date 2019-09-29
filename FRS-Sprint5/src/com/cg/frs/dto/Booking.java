package com.cg.frs.dto;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="Booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="booking_id")
	private BigInteger bookingId;
	@Column(name="user_id")
	private BigInteger userId;
	@Column(name="booking_date")
	private LocalDateTime bookingDate;
	@Column(name="ticket_cost")
	private Double ticketCost;
	@Column(name="passenger_count")
	private Integer passengerCount;
	@Column(name="bookingState")
	private Boolean bookingState;
	@OneToOne(fetch = FetchType.EAGER)
	private ScheduleFlight scheduleFlight;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Passenger> passengerList;

	public Booking() {
		super();
	}

	public Booking(BigInteger bookingId, BigInteger userId, LocalDateTime bookingDate, Double ticketCost,
			Integer noOfPassengers, Boolean bookingState, ScheduleFlight scheduleFlight, List<Passenger> passengerList) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.ticketCost = ticketCost;
		this.passengerCount = noOfPassengers;
		this.bookingState = bookingState;
		this.scheduleFlight = scheduleFlight;
		this.passengerList = passengerList;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", bookingDate=" + bookingDate
				+ ", ticketCost=" + ticketCost + ", noOfPassengers=" + passengerCount + ", bookingState=" + bookingState
				+ ", scheduleFlight=" + scheduleFlight + ", passengerList=" + passengerList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
		result = prime * result + ((bookingId == null) ? 0 : bookingId.hashCode());
		result = prime * result + ((passengerCount == null) ? 0 : passengerCount.hashCode());
		result = prime * result + ((passengerList == null) ? 0 : passengerList.hashCode());
		result = prime * result + ((scheduleFlight == null) ? 0 : scheduleFlight.hashCode());
		result = prime * result + ((ticketCost == null) ? 0 : ticketCost.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((bookingState == null) ? 0 : bookingState.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		if (bookingDate == null) {
			if (other.bookingDate != null)
				return false;
		} else if (!bookingDate.equals(other.bookingDate))
			return false;
		if (bookingId == null) {
			if (other.bookingId != null)
				return false;
		} else if (!bookingId.equals(other.bookingId))
			return false;
		if (passengerCount == null) {
			if (other.passengerCount != null)
				return false;
		} else if (!passengerCount.equals(other.passengerCount))
			return false;
		if (passengerList == null) {
			if (other.passengerList != null)
				return false;
		} else if (!passengerList.equals(other.passengerList))
			return false;
		if (scheduleFlight == null) {
			if (other.scheduleFlight != null)
				return false;
		} else if (!scheduleFlight.equals(other.scheduleFlight))
			return false;
		if (ticketCost == null) {
			if (other.ticketCost != null)
				return false;
		} else if (!ticketCost.equals(other.ticketCost))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (bookingState == null) {
			if (other.bookingState != null)
				return false;
		} else if (!bookingState.equals(other.bookingState))
			return false;
		return true;
	}

	public BigInteger getBookingId() {
		return bookingId;
	}

	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}

	public Integer getNoOfPassengers() {
		return passengerCount;
	}

	public void setNoOfPassengers(Integer noOfPassengers) {
		this.passengerCount = noOfPassengers;
	}

	public Boolean getBookingState() {
		return bookingState;
	}

	public void setBookingState(Boolean bookingState) {
		this.bookingState = bookingState;
	}

	public ScheduleFlight getScheduleFlight() {
		return scheduleFlight;
	}

	public void setScheduleFlight(ScheduleFlight scheduleFlight) {
		this.scheduleFlight = scheduleFlight;
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

}
