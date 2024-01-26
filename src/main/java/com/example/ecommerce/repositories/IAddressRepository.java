package com.example.ecommerce.repositories;

import com.example.ecommerce.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Long> {

    Optional<Address> findById(Long id);

    List<Address> findAllByUserId(Long id);
}
