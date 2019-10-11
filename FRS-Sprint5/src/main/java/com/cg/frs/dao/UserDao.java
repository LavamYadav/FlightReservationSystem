/**
 * 
 */
package com.cg.frs.dao;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.frs.dto.User;

/**
 * @author DEVANG
 *
 */

@Repository
public interface UserDao extends JpaRepository<User, BigInteger> {

	Optional<User> findByUserName(String userName);
	
}
