package com.deliveryboy.controller;


import com.deliveryboy.service.kafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Location")
public class LocationController {

    @Autowired
    private kafkaService kService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        for(int i = 0 ; i < 100000; i++) {
            this.kService.updateLocation("( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + ")" ,i); // latitude= random number
            System.out.println("Message produce one by one : "+i);
        }
        return new ResponseEntity<>(Map.of("Message","Location Updated"), HttpStatus.OK);
    }

}
