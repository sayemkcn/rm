package net.toracode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class RmApplication {

    public static void main(String[] args) {
        SpringApplication.run(RmApplication.class, args);
    }
}
