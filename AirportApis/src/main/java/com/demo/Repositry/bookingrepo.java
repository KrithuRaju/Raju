package com.demo.Repositry;

import org.springframework.data.repository.CrudRepository;


import com.demo.pojo.Booking;

public interface bookingrepo extends CrudRepository<Booking,Integer> {

	

}
