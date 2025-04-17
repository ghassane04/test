package com.example.demo.Services;

import com.example.demo.Entities.GradableItem;
import com.example.demo.Repositories.GradableItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradableItemService {

    @Autowired
    private GradableItemRepository gradableItemRepository;

    public GradableItem createGradableItem(GradableItem gradableItem) {
        return gradableItemRepository.save(gradableItem);
    }

    public List<GradableItem> getAllGradableItems() {
        return gradableItemRepository.findAll();
    }

    public GradableItem getGradableItemById(String id) {
        return gradableItemRepository.findById(id).orElse(null);
    }

    public GradableItem updateGradableItem(GradableItem gradableItem) {
        return gradableItemRepository.save(gradableItem);
    }

    public void deleteGradableItem(String id) {
        gradableItemRepository.deleteById(id);
    }
}