package com.enocachallenge.springbootmvcexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<orderRepository, Integer> {
}
