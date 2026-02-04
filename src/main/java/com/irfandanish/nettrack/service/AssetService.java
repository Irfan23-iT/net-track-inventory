package com.irfandanish.nettrack.service;

import com.irfandanish.nettrack.model.Asset;
import com.irfandanish.nettrack.repository.AssetRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.InetAddress;
import java.util.List;

@Service // Tells Spring: "This class holds the Business Logic"
public class AssetService {

    private final AssetRepository repository;

    public AssetService(AssetRepository repository) {
        this.repository = repository;
    }

    // 1. Pass-through to get all assets
    public List<Asset> findAll() {
        return repository.findAll();
    }

    // 2. Pass-through to save
    public void save(Asset asset) {
        repository.save(asset);
    }

    // 3. Pass-through to get one
    public Asset findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // 4. Pass-through to delete
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    // 5. THE REAL LOGIC: The Ping Function moved here!
    public void pingAsset(Long id) {
        Asset asset = findById(id);
        if (asset != null && asset.getIpAddress() != null && !asset.getIpAddress().isEmpty()) {
            try {
                InetAddress address = InetAddress.getByName(asset.getIpAddress());
                boolean reachable = address.isReachable(3000);
                asset.setStatus(reachable ? "Online 🟢" : "Offline 🔴");
            } catch (IOException e) {
                asset.setStatus("Error ⚠️");
            }
            repository.save(asset);
        }
    }
}