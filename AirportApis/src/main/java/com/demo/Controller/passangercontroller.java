package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.PassangerService;
import com.demo.pojo.Passanger;



@RestController
public class passangercontroller {

	@Autowired
	private PassangerService passService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/passangers"))
	 public List<Passanger> getAllpass(){
		 
		 return passService.getAllpass();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/passangers/add"))
	public void addpass(@RequestBody Passanger pass)
	{
		passService.addpass(pass);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/passangers/{id}"))
	public void updatepass(@PathVariable Integer id,@RequestBody Passanger pass)
	{
		passService.updatepass(id,pass);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/passangers/{id}"))
	public void deletepass(@PathVariable Integer id)
	{
		passService.deletepass(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/passangers/{id}")
	public Passanger getpassById(@PathVariable int id) {
		return passService.getpassById(id);
	}
	
	 
}
