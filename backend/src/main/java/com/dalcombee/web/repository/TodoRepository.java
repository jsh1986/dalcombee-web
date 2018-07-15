package com.dalcombee.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dalcombee.web.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
	public List<Todo> findAllByOrderByIsDoneAscUpdatedAtDesc();
}
