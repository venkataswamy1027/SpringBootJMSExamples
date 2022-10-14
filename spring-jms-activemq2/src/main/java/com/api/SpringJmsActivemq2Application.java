package com.api;
import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsMessagingTemplate;

@SpringBootApplication
@EnableJms
public class SpringJmsActivemq2Application implements CommandLineRunner {

    public static void main( String[] args ) {
        SpringApplication.run( SpringJmsActivemq2Application.class, args );
    }

    @Bean
    public Queue queue() {
        return new ActiveMQQueue( "myQueue" );
    }
    
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void run( String... arg0 ) throws Exception {
        // This will put text message to queue
        this.jmsMessagingTemplate.convertAndSend( this.queue, "Hello Venkat." );
        System.out.println( "Message has been put to queue by sender" );
    }
}
