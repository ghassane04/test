package com.example.demo.Controllers;

import com.example.demo.Entities.GradableItem;
import com.example.demo.Services.GradableItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gradableItems")
public class GradableItemController {

    @Autowired
    private GradableItemService gradableItemService;

    @PostMapping
    public GradableItem createGradableItem(@RequestBody GradableItem gradableItem) {
        return gradableItemService.createGradableItem(gradableItem);
    }

    @GetMapping
    public List<GradableItem> getAllGradableItems() {
        return gradableItemService.getAllGradableItems();
    }

    @GetMapping("/{id}")
    public GradableItem getGradableItemById(@PathVariable String id) {
        return gradableItemService.getGradableItemById(id);
    }

    @PutMapping("/{id}")
    public GradableItem updateGradableItem(@PathVariable String id, @RequestBody GradableItem gradableItem) {
        gradableItem.setItemId(id);
        return gradableItemService.updateGradableItem(gradableItem);
    }

    @DeleteMapping("/{id}")
    public void deleteGradableItem(@PathVariable String id) {
        gradableItemService.deleteGradableItem(id);
    }
}