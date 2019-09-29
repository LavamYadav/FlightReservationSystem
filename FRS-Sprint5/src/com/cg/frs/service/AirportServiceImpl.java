package com.cg.frs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.frs.dao.AirportDao;
import com.cg.frs.dto.Airport;
import com.cg.frs.exception.FRSException;

@Service("airportService")
@Transactional
public class AirportServiceImpl implements AirportService {

	@Autowired
	AirportDao airportDao;
	
	@Override
	public List<Airport> viewAirport() {
		return airportDao.viewAirport();
	}

	@Override
	public Airport viewAirport(String airportCode) throws FRSException {
		List<Airport> airportList=airportDao.viewAirport();
		for(Airport airport: airportList) {
			if(airport.getAirportCode().equals(airportCode))
				return airport;
		}
		throw new FRSException("InvalidAirportCode.");
	}

	@Override
	public String validateAirportWithCode(String airportCode) throws FRSException {
		if(viewAirport(airportCode).equals(null))
			throw new FRSException("InvalidAirportCode.");
		return airportCode;
	}

	@Override
	public int compareAirport(Airport src, Airport dest) throws FRSException {
		if(src==dest && src.equals(dest))
			throw new FRSException("Source and Destination Airports cannot be the Same.");
		return 0;
	}

}
