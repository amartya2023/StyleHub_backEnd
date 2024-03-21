package com.StyleHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StyleHub.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
