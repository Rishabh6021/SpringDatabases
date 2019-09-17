package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Catlog;

@Service
public class CatlogService {
   
	@Autowired
	private CrudRepository<Catlog, Integer> repo;
	
	public Iterable<Catlog> findAll()
	{
		return this.repo.findAll();
		
	
	}
	
	public Catlog add(Catlog obj)
	{
		return this.repo.save(obj);
		
	}
}
	
