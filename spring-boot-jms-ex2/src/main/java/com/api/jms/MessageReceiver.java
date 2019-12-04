/*
 * MessageReceiver.java
 * 
 * Copyright (c) 2019 by General Electric Company. All rights reserved.
 * 
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.api.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author 503118564
 */
@Component
public class MessageReceiver {

    @JmsListener ( destination = "javainuse" )
    public void receiveQueue( String text ) {
        try {
            Thread.sleep( 5000 );
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        }
        System.out.println( "Message Received: " + text );
    }
}
