package com.imcdermott.resourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app")
public class AppController
{
    @GetMapping(value = "/unprotected")
    public String getUnprotectedResource()
    {
        return "Retrieved app resource not protected by OAuth";
    }
}

