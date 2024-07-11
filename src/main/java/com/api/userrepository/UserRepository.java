package com.api.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
