package com.demo.Repositry;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Schedule;

public interface Schedulerepo extends CrudRepository<Schedule,Integer> {

}
