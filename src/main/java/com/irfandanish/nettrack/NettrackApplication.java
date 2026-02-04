package com.irfandanish.nettrack;

import com.irfandanish.nettrack.model.Asset;
import com.irfandanish.nettrack.repository.AssetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NettrackApplication {

    public static void main(String[] args) {
        SpringApplication.run(NettrackApplication.class, args);
    } 
}