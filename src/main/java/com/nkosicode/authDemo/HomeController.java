package com.nkosicode.authDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "Protected Page";
    }
}
//Next add custom login route and protect some page;
//