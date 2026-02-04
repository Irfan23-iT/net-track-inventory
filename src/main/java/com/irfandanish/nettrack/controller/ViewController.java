package com.irfandanish.nettrack.controller;

import com.irfandanish.nettrack.repository.AssetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.irfandanish.nettrack.model.Asset;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    // --- METHOD 4: Delete an Asset ---
    @GetMapping("/delete/{id}")
    public String deleteAsset(@PathVariable Long id) {
        // 1. Tell the repo to delete the item with this specific ID
        repository.deleteById(id);
        
        // 2. Redirect back to the main list
        return "redirect:/";
    }
    // --- METHOD 5: Show the Edit Form ---
@GetMapping("/edit/{id}")
public String showUpdateForm(@PathVariable Long id, Model model) {
    // 1. Find the asset by ID (or throw error if not found)
    Asset asset = repository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid asset Id:" + id));

    // 2. Put the existing data into the form
    model.addAttribute("asset", asset);

    // 3. Reuse the "add-asset" page!
    return "add-asset";
}
} // End of Class