package com.example.demo;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

		@Bean
		public java.util.function.Consumer<KStream<String, String>> process() {

			return input ->
					input.foreach((key, value) -> {
						System.out.println("Key: " + key + " Value: " + value);
					});
		}


}
