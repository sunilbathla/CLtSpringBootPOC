package com.angularpoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angularpoc.dto.BePrsnDto;

public interface BePrsnDAO extends JpaRepository<BePrsnDto, Integer> {
	
}
