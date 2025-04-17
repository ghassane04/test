package com.example.demo.Controllers;

import com.example.demo.Entities.CourseMaterial;
import com.example.demo.Services.CourseMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courseMaterials")
public class CourseMaterialController {

    @Autowired
    private CourseMaterialService courseMaterialService;

    @PostMapping
    public CourseMaterial createCourseMaterial(@RequestBody CourseMaterial courseMaterial) {
        return courseMaterialService.createCourseMaterial(courseMaterial);
    }

    @GetMapping
    public List<CourseMaterial> getAllCourseMaterials() {
        return courseMaterialService.getAllCourseMaterials();
    }

    @GetMapping("/{id}")
    public CourseMaterial getCourseMaterialById(@PathVariable String id) {
        return courseMaterialService.getCourseMaterialById(id);
    }

    @PutMapping("/{id}")
    public CourseMaterial updateCourseMaterial(@PathVariable String id, @RequestBody CourseMaterial courseMaterial) {
        courseMaterial.setMaterialId(id);
        return courseMaterialService.updateCourseMaterial(courseMaterial);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseMaterial(@PathVariable String id) {
        courseMaterialService.deleteCourseMaterial(id);
    }
}