package com.abdelkarim.interviewbackend.repository;

import com.abdelkarim.interviewbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
