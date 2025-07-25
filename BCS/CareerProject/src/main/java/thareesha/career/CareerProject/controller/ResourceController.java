package thareesha.career.CareerProject.controller;

import thareesha.career.CareerProject.models.Resource;
import thareesha.career.CareerProject.services.ResourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {
    @Autowired
    private ResourceService resourceservice;

    @GetMapping
    public List<Resource> getAllResources() {
        return resourceservice.getAllResources();
    }

    @GetMapping("/career/{careerId}")
    public List<Resource> getResourcesForCareer(@PathVariable Long careerId) {
        return resourceservice.getResourcesForCareer(careerId);
    }

    @PostMapping
    public Resource createResource(@RequestBody Resource resource) {
        return resourceservice.createResource(resource);
    }

    @PutMapping("/{id}")
    public Resource updateResource(@PathVariable Long id, @RequestBody Resource resource) {
        resource.setId(id);
        return resourceservice.updateResource(id, resource);
    }

    @DeleteMapping("/{id}")
    public void deleteResource(@PathVariable Long id) {
        resourceservice.deleteResource(id);
    }
}