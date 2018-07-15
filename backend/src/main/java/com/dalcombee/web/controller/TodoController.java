package com.dalcombee.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dalcombee.web.domain.Todo;
import com.dalcombee.web.service.TodoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/todo")
@RestController
public class TodoController {
	@Autowired
	TodoService todoService;
	
	@GetMapping("/all")
	public List<Todo> all() {
		return todoService.findOrderedList();
	}

	@PostMapping
	public Todo regist(String title) {
		return todoService.regist(title);
	}
	
	@GetMapping("/{todoNo}")
	public Todo find(@PathVariable int todoNo) {
		return todoService.find(todoNo);
	}
	
	@PostMapping("/{todoNo}/toggle")
	public Todo toggle(@PathVariable int todoNo) {
		return todoService.toggle(todoNo);
	}
	
	@DeleteMapping("/{todoNo}")
	public String delete(@PathVariable int todoNo) {
		todoService.delete(todoNo);
		return "ok";
	}
}