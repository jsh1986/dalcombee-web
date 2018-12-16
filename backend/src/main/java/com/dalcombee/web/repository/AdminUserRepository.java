package com.dalcombee.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dalcombee.web.domain.AdminUser;

public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {
	
}