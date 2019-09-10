package com.cg.frs.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.frs.dao.FlightDao;
import com.cg.frs.dao.FlightDaoImpl;
import com.cg.frs.dto.Flight;
import com.cg.frs.exception.FRSException;

public class FlightServiceImpl implements FlightService{

	FlightDao flightDao=new FlightDaoImpl();

	@Override
	public Flight addFlight(Flight flight) {
		return flightDao.addFlight(flight);
	}

	@Override
	public Flight modifyFlight(Flight flight) {
		return flightDao.addFlight(flight);
	}

	@Override
	public List<Flight> viewFlight() {
		return flightDao.viewFlight();
	}

	@Override
	public Flight viewFlight(BigInteger flightId) {
		List<Flight> flightList=flightDao.viewFlight();
		for(Flight flight: flightList) {
			if(flight.getFlightNumber()==flightId)
				return flight;
		}
		return null;
	}

	@Override
	public void deleteFlight(BigInteger flightId) {
		flightDao.deleteFlight(flightId);
	}

	@Override
	public BigInteger validateFlightWithId(BigInteger flightId) throws FRSException{
		if(viewFlight(flightId)==null)
			throw new FRSException("InvalidFlightId.");
		return flightId;
	}
	
}
