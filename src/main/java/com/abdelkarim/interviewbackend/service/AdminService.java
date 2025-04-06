package com.abdelkarim.interviewbackend.service;

import com.abdelkarim.interviewbackend.dto.AdminDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    String addAdmin(AdminDTO authorSaveDTO);

    List<AdminDTO> getAllAdmin();

    String updateAdmin(AdminDTO adminUpdateDTO);

    String deleteAdmin(int id);
}
