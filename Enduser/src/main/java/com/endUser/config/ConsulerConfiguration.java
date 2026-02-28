package com.endUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class ConsulerConfiguration {

    @KafkaListener(topics=AppConstant.Location_Update_Topic,groupId=AppConstant.Group_Id)
    public void updatedlocation(String value){
        System.out.println(value);
    }
}
