package com.example.democrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.democrud.domain.Post;
import com.example.democrud.domain.PostRepository;

@SpringBootApplication
public class DemocrudApplication implements CommandLineRunner {

	@Autowired
	private PostRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemocrudApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {
		for(int i = 0;i<5;i++)
		{
			repository.save(new Post("My post number #" + (i + 1)));
		}
		
	}
	
	
}
