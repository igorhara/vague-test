package org.igor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages="org.igor")
public class VagueTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(VagueTestApplication.class, args);
	}
}
