package com.demo.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.Repositry.AirportRepositary;
import com.demo.pojo.Airport;

@Service
public class AirportService {
	
	@Autowired
	public AirportRepositary airRepo;
	
	public List<Airport> getAll(){
    List<Airport>airports=new ArrayList<>();
	airRepo.findAll().forEach(airports::add);
	return airports;

    }
	public void bookFlight(Airport air) {
	airRepo.save(air);
	}
	public void updateFlightDetails(Integer id,Airport air) {
	airRepo.save(air);
	}
	public void cancelBooking(Integer id) {
	airRepo.deleteById(id);
	}
	public Airport getMyFlightDetails(int id) {
	return airRepo.findById(id).orElse(null);





	}





}
