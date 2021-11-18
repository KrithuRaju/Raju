package com.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repositry.Scflightsrepo;
import com.demo.pojo.ScheduledFlights;

@Service
public class ScflightService {
	@Autowired
	public Scflightsrepo scfRepo;
	 public List<ScheduledFlights> getAllscf(){
		 
		 List<ScheduledFlights>s=new ArrayList<>();
		 scfRepo.findAll().forEach(s::add);
		 return s; 

}
	 public void addscf(ScheduledFlights scf) {
		   scfRepo.save(scf);
	 }
	 public void updatescf(Integer id,ScheduledFlights scf) {
		    scfRepo.save(scf);
	 }
	 public void deletescf(Integer id) {
		    scfRepo.deleteById(id);
	 }
	 public ScheduledFlights getscfrById(int id) {
			return scfRepo.findById(id).orElse(null);
			
			
			
	}
}
