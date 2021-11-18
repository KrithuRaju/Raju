package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.AirportService;
import com.demo.pojo.Airport;

@RestController
public class Aiportcontroller {
	
	@Autowired
	private AirportService AirService;
	

	@RequestMapping(method=RequestMethod.POST,value=("/airports/add"))
	public void bookFlight(@RequestBody Airport aiport)
	{
	AirService.bookFlight(aiport);



	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/airports/{id}"))

	public void updateFlightDetails(@PathVariable Integer id,@RequestBody Airport airport)
	{
	AirService.updateFlightDetails(id,airport);



	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/airports/{id}"))
	public void cancelBooking(@PathVariable Integer id)
	{
	AirService.cancelBooking(id);



	}
	
	@RequestMapping(method=RequestMethod.GET, value="/airports/{id}")
	public Airport getMyFlightDetails(@PathVariable int id) {

	return AirService.getMyFlightDetails(id);
	}
	


}
