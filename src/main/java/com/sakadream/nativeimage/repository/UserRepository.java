package com.sakadream.nativeimage.repository;

import com.sakadream.nativeimage.models.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {}
