package com.irfandanish.nettrack.controller;

import com.irfandanish.nettrack.repository.AssetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.irfandanish.nettrack.model.Asset;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViewController {

    private final AssetRepository repository;

    public ViewController(AssetRepository repository) {
        this.repository = repository;
    }

    // --- METHOD 1: Show the Dashboard ---
    @GetMapping("/") 
    public String showAssets(Model model) {
        var allAssets = repository.findAll();
        model.addAttribute("assets", allAssets);
        return "assets";
    } // <--- This closing bracket was missing!

    // --- METHOD 2: Show the "Add New" Form ---
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("asset", new Asset());
        return "add-asset";
    }

    // --- METHOD 3: Handle the Form Submission ---
    @PostMapping("/save")
    public String saveAsset(@ModelAttribute Asset asset) {
        repository.save(asset);
        return "redirect:/";
    }
    
} // End of Class