package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/login")
    public String showDoctorLoginPage() {
        return "doctorLogin"; // Renders the doctorLogin.jsp
    }
}