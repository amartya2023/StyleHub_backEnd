package com.StyleHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StyleHub.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
