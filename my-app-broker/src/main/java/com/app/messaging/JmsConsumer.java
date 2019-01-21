package com.app.messaging;
import org.apache.activemq.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
 
 
@Component
public class JmsConsumer {
	
	@JmsListener(destination = "${fidelity.activemq.queue}", containerFactory="jsaFactory", subscription="FirstTopic")
	public void receive(Message message){
		System.out.println("Recieved Message: " + message);
	}
}