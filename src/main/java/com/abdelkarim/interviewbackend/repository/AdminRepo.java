package com.abdelkarim.interviewbackend.repository;

import com.abdelkarim.interviewbackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
}
