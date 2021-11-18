package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.Scservice;
import com.demo.pojo.Schedule;

@RestController
public class ScConntrooler {

	@Autowired
	private Scservice scService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/Schedule"))
	 public List<Schedule> getAllsc(){
		 
		 return scService.getAllsch();

}
	
	@RequestMapping(method=RequestMethod.POST,value=("/Schedule/add"))
	public void addsc(@RequestBody Schedule sc)
	{
		scService.addsc(sc);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/Schedule/{id}"))
	public void updatesc(@PathVariable Integer id,@RequestBody Schedule sc)
	{
		scService.updatesc(id,sc);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value=("/Schedule/{id}"))
	public void Deletesc(@PathVariable Integer id)
	{
		scService.deletesc(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/Schedule/{id}")
	public Schedule findscById(@PathVariable int id) {
		return scService.getscById(id);
	}
	
	 
	 
}
