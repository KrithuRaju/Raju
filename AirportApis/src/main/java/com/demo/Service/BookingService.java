package com.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repositry.bookingrepo;
import com.demo.pojo.Booking;

@Service
public class BookingService {
	
	@Autowired
	public bookingrepo bookRepo;
	
	public void bookFlight(Booking book) {
	bookRepo.save(book);
	}
	

	public void bookingstaus(Integer id, Booking book) {
		bookRepo.save(book);
		
	}

	public void canclebooking(Integer id) {
	
		bookRepo.deleteById(id);
	}

	public  List<Booking> getAlllist() {
		 List<Booking>b1=new ArrayList<>();
		bookRepo.findAll().forEach(b1::add);
			return b1;
	}

	public Booking bookingdetails(int id) {
		// TODO Auto-generated method stub
		return bookRepo.findById(id).orElse(null);
	}


	public void booking(Integer id, Booking book) {
		// TODO Auto-generated method stub
		
	}

}
