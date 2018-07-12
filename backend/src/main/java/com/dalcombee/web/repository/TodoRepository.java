package com.dalcombee.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dalcombee.web.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
	
}
