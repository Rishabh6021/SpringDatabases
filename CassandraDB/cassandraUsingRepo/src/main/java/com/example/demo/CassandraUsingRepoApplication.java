package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
//import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Catlog;
import com.example.demo.service.CatlogService;

@SpringBootApplication
public class CassandraUsingRepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=  SpringApplication.run(CassandraUsingRepoApplication.class, args);
	
	  CatlogService service=ctx.getBean(CatlogService.class);
	  
//	  CrudRepository repo =ctx.getBean("catlogRepository",CrudRepository.class);
//	  
//	  CrudRepository repo =ctx.getBean("customerRepository",CrudRepository.class);
	  
//	  If there are 2 repository  repositories interfacing crudrepository then need to specify bean name too
	  
	  Catlog item = ctx.getBean(Catlog.class);
	  
	  Catlog saved = service.add(item);
	  
	  System.out.println("One item added"+saved);
	  
	  Iterable<Catlog> list = service.findAll();
	  
	  list.forEach(System.out::println);
	  
	  ctx.close();
	  
	  
	}
	@Bean
	public Catlog catlog()
	{
		return new Catlog(905,"broadband","20 days",120);
	}

}
