package com.imcdermott.resourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController
{
    @GetMapping(value = "/protected")
    public String getProtectedResource()
    {
        return "Retrieved API resource protected by OAuth";
    }
}

