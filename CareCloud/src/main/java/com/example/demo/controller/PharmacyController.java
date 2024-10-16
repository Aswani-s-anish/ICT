package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pharmacy")
public class PharmacyController {

    @GetMapping("/login")
    public String showPharmacyLoginPage() {
        return "pharmacyLogin"; // Renders the pharmacyLogin.jsp
    }
}