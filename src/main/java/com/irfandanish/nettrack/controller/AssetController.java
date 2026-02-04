package com.irfandanish.nettrack.controller;

import com.irfandanish.nettrack.model.Asset;
import com.irfandanish.nettrack.repository.AssetRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // 1. Tells Spring: "This class handles web requests & returns JSON data"
@RequestMapping("/api/assets") // 2. The base URL for everything in this class
public class AssetController {

    private final AssetRepository repository;

    // Constructor Injection (Better than @Autowired)
    public AssetController(AssetRepository repository) {
        this.repository = repository;
    }

    // The modern version of "doGet"
    @GetMapping
    public List<Asset> getAllAssets() {
        // This automatically converts the Java Objects into JSON!
        return repository.findAll();
    }
}