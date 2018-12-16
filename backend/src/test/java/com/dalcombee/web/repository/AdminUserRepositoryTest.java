package com.dalcombee.web.repository;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.dalcombee.web.DalcombeeWebApplicationTest;
import com.dalcombee.web.domain.AdminUser;

@RunWith(SpringRunner.class)
public class AdminUserRepositoryTest extends DalcombeeWebApplicationTest {
	@Autowired
	AdminUserRepository adminUserRepository;

	@Test
	public void testfindAll() {
		List<AdminUser> adminUsers = adminUserRepository.findAll();
		System.out.println("###" + adminUsers);
	}

}
