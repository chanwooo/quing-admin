package com.example.quingadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class QuingAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuingAdminApplication.class, args);
    }

}
