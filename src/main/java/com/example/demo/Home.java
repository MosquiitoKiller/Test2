package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller class responding to the start page view
 */
@Controller
public class Home {
    /**
     * Method responsible for displaying the start page
     * @return HTML page
     */
    @RequestMapping("/home")
    public String home(){
        return "My";
    }
}
