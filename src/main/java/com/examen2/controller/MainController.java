/**
 * @author KEREN NICOLE JIMENEZ FERNANDEZ
 */
package com.examen2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String index(){
        return "ejemplo";
    }
  
}
        
