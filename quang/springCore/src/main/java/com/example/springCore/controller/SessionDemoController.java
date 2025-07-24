package com.example.springCore.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/session-demo")
public class SessionDemoController {
    @GetMapping("/set")
    public String setSession(HttpSession session, @RequestParam String value) {
        session.setAttribute("demo", value);
        return "Đã lưu session: " + value;
    }

    @GetMapping("/get")
    public String getSession(HttpSession session) {
        Object value = session.getAttribute("demo");
        return "Giá trị session: " + value;
    }
} 