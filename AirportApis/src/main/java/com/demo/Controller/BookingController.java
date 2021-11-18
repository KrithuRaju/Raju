package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.BookingService;
import com.demo.pojo.Booking;
@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookService;
	
	@RequestMapping(method=RequestMethod.PUT,value=("/booking/{id}"))
	public void booking(@PathVariable Integer id,@RequestBody Booking book)
	{
		bookService.booking(id,book);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value=("/booking/{id}"))
	public void bookingstaus(@PathVariable Integer id,@RequestBody Booking book)
	{
		bookService.bookingstaus(id,book);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value=("/booking/{id}"))
	public void canclebooking(@PathVariable Integer id)
	{
		bookService.canclebooking(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value=("/booking"))
	 public List<Booking> getAlllist(){
		 
		 return bookService.getAlllist();

}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/Booking/{id}")
	public Booking bookingdetails(@PathVariable int id) {
		return bookService.bookingdetails(id);
	}
	
	 

}
