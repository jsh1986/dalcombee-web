package com.dalcombee.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dalcombee.web.domain.Cash;
import com.dalcombee.web.service.CashService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/cash")
@RestController
public class CashController {
	@Autowired
	CashService cashService;
	
	@GetMapping("/all")
	public List<Cash> all() {
		return cashService.findOrderedList();
	}

	@PostMapping
	public Cash regist(String title) {
		return cashService.regist(title);
	}
	
	@GetMapping("/{cashNo}")
	public Cash find(@PathVariable int cashNo) {
		return cashService.find(cashNo);
	}
	
	@PostMapping("/{cashNo}/toggle")
	public Cash toggle(@PathVariable int cashNo) {
		return cashService.toggle(cashNo);
	}
	
	@DeleteMapping("/{cashNo}")
	public String delete(@PathVariable int cashNo) {
		cashService.delete(cashNo);
		return "ok";
	}
}