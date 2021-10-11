package com.udacity.jdnd.java_project;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;



@Service
public class MessageServices {
    private String message;

    public MessageServices(String message){
        this.message = message;
    }

    public String upperCase(){
        return this.message.toUpperCase();
    }

    public String lowerCase(){
        return this.message.toLowerCase();
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Bean: 2, source:MessageServices, data: Create Message Services Beans");
    }

}