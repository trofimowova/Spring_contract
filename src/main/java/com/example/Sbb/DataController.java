package com.example.Sbb;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping(value = "/datagroups")
    public String showDataGroup(){
        return " STUB";
    }



}





