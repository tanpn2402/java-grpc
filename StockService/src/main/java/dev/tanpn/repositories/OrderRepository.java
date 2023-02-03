package dev.tanpn.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.tanpn.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
  // List<OrderEntity> findByUsername(String username);
}