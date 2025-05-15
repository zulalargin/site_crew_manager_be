package com.zulal.sitecrew.controller;

import com.zulal.sitecrew.model.Personnel;
import com.zulal.sitecrew.service.PersonnelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personnel")
@CrossOrigin
public class PersonnelController {

    private final PersonnelService personnelService;

    public PersonnelController(PersonnelService personnelService) {
        this.personnelService = personnelService;
    }

    @GetMapping
    public List<Personnel> getAll() {
        return personnelService.getAll();
    }

    @GetMapping("/by-site/{siteId}")
    public List<Personnel> getBySiteId(@PathVariable Integer siteId) {
        return personnelService.getBySiteId(siteId);
    }

    @PutMapping("/{id}/assign/{siteId}")
    public Personnel assignSite(@PathVariable Integer id, @PathVariable Integer siteId) {
        return personnelService.updateSite(id, siteId);
    }

    @PostMapping
    public Personnel create(@RequestBody Personnel p) {
        return personnelService.save(p);
    }
}
