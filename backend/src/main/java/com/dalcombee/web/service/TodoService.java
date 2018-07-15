package com.dalcombee.web.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dalcombee.web.domain.Todo;
import com.dalcombee.web.repository.TodoRepository;

@Service
public class TodoService {
	@Autowired
	TodoRepository todoRepository;

	public List<Todo> findAllByOrderByIsDoneDescNoDesc() {
		return todoRepository.findAllByOrderByIsDoneDescNoDesc();
	}

	public Todo regist(String title) {
		Todo todo = new Todo();
		todo.setTitle(title);
		todo.setDone(false);
		todo.setCreatedAt(new Date());
		todoRepository.save(todo);
		return todo;
	}
	
	public Todo find(int todoNo) {
		return todoRepository.findById(todoNo).get();
	}

	public void delete(int todoNo) {
		todoRepository.deleteById(todoNo);
	}

	public Todo toggle(int todoNo) {
		Todo saved = todoRepository.findById(todoNo).get();
		saved.setDone(!saved.isDone());
		todoRepository.save(saved);
		return saved;
	}
	
}
