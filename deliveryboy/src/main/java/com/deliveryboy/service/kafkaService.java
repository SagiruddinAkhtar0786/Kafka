package com.deliveryboy.service;

import com.deliveryboy.config.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class kafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

   private Logger logger = LoggerFactory.getLogger(kafkaService.class);
   /* public boolean updateLocation(String location){
        this.kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME,location);// topic ,data
        this.logger.info("Message produced");
        return true;
    }*/

    public boolean updateLocation(String location ,int i){

            this.kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME,location);// topic ,data
            this.logger.info("Message produced : "+i);
            System.out.println("-------------------------------------------");

        //this.logger.info("Message produced");
        return true;
    }

}
