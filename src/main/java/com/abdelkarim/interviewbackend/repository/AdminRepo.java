package com.abdelkarim.interviewbackend.repository;

import com.abdelkarim.interviewbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<User, Integer> {
}
