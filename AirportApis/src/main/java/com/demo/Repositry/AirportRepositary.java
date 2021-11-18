package com.demo.Repositry;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Airport;

public interface AirportRepositary extends CrudRepository<Airport,Integer> {

	

}
