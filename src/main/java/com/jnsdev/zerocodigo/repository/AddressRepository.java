package com.jnsdev.zerocodigo.repository;


import com.jnsdev.zerocodigo.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @Autor Jairo Nascimento
 * @Created 08/03/2026 - 13:08
 */

@RepositoryRestResource(exported = false)
public interface AddressRepository extends CrudRepository<Address, Long>, PagingAndSortingRepository<Address, Long> {
}
