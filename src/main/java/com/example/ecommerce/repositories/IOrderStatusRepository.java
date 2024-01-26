package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IOrderStatusRepository extends JpaRepository<OrderStatus, Long> {
    Optional<OrderStatus> findByName(String name);

    boolean existsByName(String name);
}
