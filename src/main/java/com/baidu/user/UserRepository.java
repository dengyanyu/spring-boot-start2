package com.baidu.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User, Long>,JpaRepository<User, Long>{

	  @Query(value = "select * from user ",
			    countQuery = "select count(*) from user",
			    nativeQuery = true)
	  Page<User> findPage( Pageable pageable);

}