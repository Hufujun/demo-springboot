package com.hu.repository;

import com.hu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Hu on 2017/8/15.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
        @Query("select t from User t where t.name = :name")
        User findByUserName(@Param("name") String name);
}
