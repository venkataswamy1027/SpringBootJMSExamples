/*
 * SpringBootJmsApplication.java
 * 
 * Copyright (c) 2019 by General Electric Company. All rights reserved.
 * 
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.api;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

/**
 * @author 503118564
 */
@SpringBootApplication
@EnableJms
public class SpringBootJmsApplication {

    public static void main( String[] args ) {
        SpringApplication.run( SpringBootJmsApplication.class, args );
    }

    @Bean
    public Queue queue() {
        return new ActiveMQQueue( "javainuse" );
    }
}
