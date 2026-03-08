package com.jnsdev.zerocodigo.repository;


import com.jnsdev.zerocodigo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @Autor Jairo Nascimento
 * @Created 08/03/2026 - 13:06
 */
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(@Param("email") String email);
}

