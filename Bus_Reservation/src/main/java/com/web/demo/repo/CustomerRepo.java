package com.web.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.demo.entity.Customer;
@Repository

public interface CustomerRepo extends JpaRepository<Customer, Long> {



	
}
