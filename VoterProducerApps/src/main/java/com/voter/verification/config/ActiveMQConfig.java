package com.voter.verification.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.support.json.Jackson2JsonObjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Active MQ configuration file to register the Input and Output Queues to this application.
 * @author rjosula
 *
 */
@Configuration
public class ActiveMQConfig {

private final String VOTER_VEIFN_JSON_MESSAGE_QUEUE_NAME = "VoterJsonMessageQueue";
	
	private final String VOTER_VEIFN_XML_MESSAGE_QUEUE_NAME = "VoterXMLMessageQueue";


	/**
	 * Voter Input Queue to read the messages
	 * @return
	 */
	@Bean
	public Queue voterMessageQueue() {
		return new ActiveMQQueue(VOTER_VEIFN_JSON_MESSAGE_QUEUE_NAME);
	}
	
	/**
	 * Voter Input Queue to write the messages
	 * @return
	 */
	@Bean
	public Queue voterOutputQueue() {
		return new ActiveMQQueue(VOTER_VEIFN_XML_MESSAGE_QUEUE_NAME);
	}
	
	/**
	 * Object mapper to convert JSON to Object (Java Object / XML Object/ any custom object)
	 * @return
	 */
	@Bean
	public static Jackson2JsonObjectMapper getMapper() {
        ObjectMapper mapper = new ObjectMapper();
        return new Jackson2JsonObjectMapper(mapper);
    }
}
