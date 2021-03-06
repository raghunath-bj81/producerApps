package com.voter.verification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
@ImportResource({"classpath*:/voter-app-configuration.xml"})
public class VoterProducerAppsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoterProducerAppsApplication.class, args);
	}

}
