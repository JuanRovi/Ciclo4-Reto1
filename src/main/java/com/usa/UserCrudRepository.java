package com.usa;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

/**
 *
 * @author Rodigo
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {

    /**
     *
     * @param email
     * @return
     */

    Optional<User> findByEmail(String email);

    /**
     *
     * @param email
     * @param password
     */

    Optional<User> findByEmailAndPassword(String email,String password);



}

