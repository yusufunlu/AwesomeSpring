package com.yusufu.awesomespring.repo;

import com.yusufu.awesomespring.entity.Customer;
import com.yusufu.awesomespring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
