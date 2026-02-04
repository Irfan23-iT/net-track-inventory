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

    // This method runs automatically on startup!
    @Bean
    public CommandLineRunner demo(AssetRepository repository) {
        return (args) -> {
            // Save a couple of assets
            repository.save(new Asset("Cisco Catalyst 2960", "C-2960-001", "Switch", "Active"));
            repository.save(new Asset("Asus TUF F15", "TUF-F15-999", "Laptop", "Assigned"));
            repository.save(new Asset("Cisco ISR 4000", "ISR-4000-X", "Router", "Maintenance"));
        };
    }
}