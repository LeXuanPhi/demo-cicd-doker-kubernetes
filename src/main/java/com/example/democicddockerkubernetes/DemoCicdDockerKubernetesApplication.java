package com.example.democicddockerkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.controller")
public class DemoCicdDockerKubernetesApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoCicdDockerKubernetesApplication.class, args);
		System.out.println("oke");
	}
}
