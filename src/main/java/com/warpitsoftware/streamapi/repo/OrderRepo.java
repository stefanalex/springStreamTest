package com.warpitsoftware.streamapi.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.warpitsoftware.streamapi.models.Order;



@Repository
public interface OrderRepo extends CrudRepository<Order, Long> {

	List<Order> findAll();
}