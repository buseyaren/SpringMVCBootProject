package com.enocachallenge.springbootmvcexample.repository;

import com.enocachallenge.springbootmvcexample.entity.customerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<customerEntity, Integer> {
}
