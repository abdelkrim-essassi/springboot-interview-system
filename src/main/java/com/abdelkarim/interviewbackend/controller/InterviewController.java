package com.abdelkarim.interviewbackend.controller;

import com.abdelkarim.interviewbackend.service.InterviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/interview")
@RestController
public class InterviewController {

    @GetMapping("/confirm")
    public void Confirm(Long id) {
        InterviewService.Confirm(id);
    }
    @GetMapping("/cancel")
    public void cancel(Long id) {
        InterviewService.Confirm(id);
    }
}


