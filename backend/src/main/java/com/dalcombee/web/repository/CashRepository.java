package com.dalcombee.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dalcombee.web.domain.Cash;

public interface CashRepository extends JpaRepository<Cash, Integer> {
	public List<Cash> findAllByOrderByIsDoneAscUpdatedAtDesc();
}
