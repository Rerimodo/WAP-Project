package javacode.repository;

import javacode.databasemodel.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    List<Role> findAll();
    Optional<Role> findById(int id);
    Optional<Role> findByRolename(String roleName);

}