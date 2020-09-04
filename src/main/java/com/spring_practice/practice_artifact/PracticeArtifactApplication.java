package com.spring_practice.practice_artifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PracticeArtifactApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeArtifactApplication.class, args);
    }

}
