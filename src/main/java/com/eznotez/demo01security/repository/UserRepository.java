package com.eznotez.demo01security.repository;

import com.eznotez.demo01security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<Integer> {

    User findByUsername(String username);
}
