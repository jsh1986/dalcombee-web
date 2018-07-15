package com.dalcombee.web.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.dalcombee.web.DalcombeeWebApplicationTest;
import com.dalcombee.web.domain.Todo;

@RunWith(SpringRunner.class)
public class TodoRepositoryTest extends DalcombeeWebApplicationTest {
	@Autowired
	TodoRepository todoRepository;

	@Test
	public void testfindAllOrderByIsDone() {
		List<Todo> list = todoRepository.findAllByOrderByIsDoneAscNoDesc();
		System.out.println("###list:" + list);
	}

}
