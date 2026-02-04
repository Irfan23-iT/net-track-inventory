package com.irfandanish.nettrack.repository;

import com.irfandanish.nettrack.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Long> {
    // This gives us save(), findAll(), delete() automatically!
}