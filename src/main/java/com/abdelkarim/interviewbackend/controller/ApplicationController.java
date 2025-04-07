package com.abdelkarim.interviewbackend.controller;

import com.abdelkarim.interviewbackend.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Application")
@RestController
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService ;

    @GetMapping("/submit")
    public void submit(Long id) {
        ApplicationService.submit(id);
    }
    @GetMapping("/cancel")
    public void UpdateStatus(Long id) {
        ApplicationService.UpdateStatus(id);
    }
}
