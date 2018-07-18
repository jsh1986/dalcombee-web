package com.dalcombee.web.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dalcombee.web.domain.Cash;
import com.dalcombee.web.repository.CashRepository;

@Service
public class CashService {
	@Autowired
	CashRepository cashRepository;

	public List<Cash> findOrderedList() {
		return cashRepository.findAllByOrderByIsDoneAscUpdatedAtDesc();
	}

	public Cash regist(String title) {
		Cash cash = new Cash();
		cash.setTitle(title);
		cash.setDone(false);
		cash.setCreatedAt(new Date());
		cash.setUpdatedAt(new Date());
		cashRepository.save(cash);
		return cash;
	}

	public Cash find(int cashNo) {
		return cashRepository.findById(cashNo).get();
	}

	public void delete(int cashNo) {
		cashRepository.deleteById(cashNo);
	}

	public Cash toggle(int cashNo) {
		Cash saved = cashRepository.findById(cashNo).get();
		saved.setDone(!saved.isDone());
		saved.setUpdatedAt(new Date());
		cashRepository.save(saved);
		return saved;
	}

}
