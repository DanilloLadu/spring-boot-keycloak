package com.oauth2.resourceserver.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OuthRestController
{
    @GetMapping("/open")
    public String open() {
        return "Open";
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/helloAdmin")
    @PreAuthorize("hasRole('admin')")
    public String helloAdmin() {
        return "Hello admin";
    }
}
