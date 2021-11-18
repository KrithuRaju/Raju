package com.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repositry.Schedulerepo;
import com.demo.pojo.Schedule;
@Service
public class Scservice {

	@Autowired
	public Schedulerepo scRepo;
	 public List<Schedule> getAllsch(){
		 
		 List<Schedule>s1=new ArrayList<>();
		 scRepo.findAll().forEach(s1::add);
		 return s1; 

}
	 public void addsc(Schedule sc) {
		    scRepo.save(sc);
	 }
	 public void updatesc(Integer id,Schedule sc) {
		    scRepo.save(sc);
	 }
	 public void deletesc(Integer id) {
		    scRepo.deleteById(id);
	 }
	 public Schedule getscById(int id) {
			return scRepo.findById(id).orElse(null);
			
			
			
	}
}
