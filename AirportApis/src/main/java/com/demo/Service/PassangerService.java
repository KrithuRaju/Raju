package com.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repositry.Passengerrepo;
import com.demo.pojo.Passanger;


@Service
public class PassangerService {
	@Autowired
	public Passengerrepo passRepo;
	
	 public List<Passanger> getAllpass(){
		 List<Passanger>pass=new ArrayList<>();
		 passRepo.findAll().forEach(pass::add);
		 return pass; 

}
	 public void addpass(Passanger pass) {
		 passRepo.save(pass);
	 }
	 public void updatepass(Integer id,Passanger pass) {
		 passRepo.save(pass);
	 }
	 public void deletepass(Integer id) {
		 passRepo.deleteById(id);
	 }
	 public Passanger getpassById(int id) {
			return passRepo.findById(id).orElse(null);
			
			
			
	}
}
