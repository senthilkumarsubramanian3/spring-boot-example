package com.javatpoint.springbootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController  
public class LoginController  
{  
@RequestMapping("/")  
public String hello()   
{  
return "Hello User";  
}  
}  