package com.app.messaging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	{
		System.out.println("Sender intantiated %%%%%%%%%%%%%%%%%%%%");
	}
  private static final Logger LOGGER =
      LoggerFactory.getLogger(Sender.class);

  @Autowired
  private JmsTemplate jmsTemplate;

  public void send(String message) {
    LOGGER.info("sending message='{}'", message);
    System.out.println("##### JMS Template"+jmsTemplate);
    jmsTemplate.convertAndSend("FirstTopic", message);
  }
}