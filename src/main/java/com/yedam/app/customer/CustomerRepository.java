package com.yedam.app.customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> { //Long => 기본키 타입. 이것만 적어주면 됨
	
	public List<Customer> findByFirstNameLike(String firstName);
}
