package com.example.democrud.domain;

import org.springframework.data.repository.CrudRepository;;

public interface PostRepository extends CrudRepository<Post,Long>
{
	
}