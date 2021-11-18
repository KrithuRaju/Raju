package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.ScflightService;
import com.demo.pojo.ScheduledFlights;
@RestController
public class Scflightscontroller {
	@Autowired
	private ScflightService scfService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/Scflights"))
	 public List<ScheduledFlights> getAllscf(){
		 
		 return scfService.getAllscf();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/Scflights/add"))
	public void addscf(@RequestBody ScheduledFlights order)
	{
		scfService.addscf(order);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/Scflights/{id}"))
	public void updatescf(@PathVariable Integer id,@RequestBody ScheduledFlights scf)
	{
		scfService.updatescf(id,scf);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/Scflights/{id}"))
	public void Deletescf(@PathVariable Integer id)
	{
		scfService.deletescf(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/Scflights/{id}")
	public ScheduledFlights findOrderById(@PathVariable int id) {
		return scfService.getscfrById(id);
	}
	
}
