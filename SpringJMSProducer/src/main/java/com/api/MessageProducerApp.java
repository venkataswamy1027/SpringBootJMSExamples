package com.api;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.api.config.AppConfig;
import com.api.model.Product;
import com.api.producer.MessageSender;

public class MessageProducerApp {

    public static void main( String[] args ) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext( AppConfig.class );

        MessageSender messageSender = context.getBean( MessageSender.class );

        Product product = new Product();
        product.setProductId( 100 );
        product.setName( "Laptop" );
        product.setQuantity( 10 );

        messageSender.sendMessage( product );
        System.out.println( "Message has been sent successfully to Queue" );

        ((AbstractApplicationContext)context).close();
    }

}
