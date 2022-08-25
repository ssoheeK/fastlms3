package com.zerobase.fastlms.main.controller;


import com.zerobase.fastlms.components.MailComponents;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@Controller
@Log4j2
public class MainController {

    private final MailComponents mailComponents;
    
    @RequestMapping("/")
    public String index(HttpServletRequest request) {

        return "index";
    }
    
    
    
    @RequestMapping("/error/denied")
    public String errorDenied() {
        
        return "error/denied";
    }
    
    
    
}
