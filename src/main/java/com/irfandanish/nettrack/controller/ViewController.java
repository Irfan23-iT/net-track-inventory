package com.irfandanish.nettrack.controller;

import com.irfandanish.nettrack.model.Asset;
import com.irfandanish.nettrack.service.AssetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {

    // We talk to the SERVICE now, not the Repository directly
    private final AssetService service;

    public ViewController(AssetService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String showAssets(Model model) {
        model.addAttribute("assets", service.findAll());
        return "assets";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("asset", new Asset());
        return "add-asset";
    }

    @PostMapping("/save")
    public String saveAsset(@ModelAttribute Asset asset) {
        service.save(asset);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Asset asset = service.findById(id);
        if (asset == null) return "redirect:/"; // Safety check
        
        model.addAttribute("asset", asset);
        return "add-asset";
    }

    @GetMapping("/delete/{id}")
    public String deleteAsset(@PathVariable Long id) {
        service.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/ping/{id}")
    public String pingAsset(@PathVariable Long id) {
        service.pingAsset(id); // Look how clean this line is now!
        return "redirect:/";
    }
}