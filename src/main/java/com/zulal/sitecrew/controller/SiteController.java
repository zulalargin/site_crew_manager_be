package com.zulal.sitecrew.controller;
 
import org.springframework.web.bind.annotation.*;

import com.zulal.sitecrew.model.Site;
import com.zulal.sitecrew.service.SiteService;

import java.util.List;

@RestController
@RequestMapping("/api/sites")
@CrossOrigin
public class SiteController {

    private final SiteService siteService;

    public SiteController(SiteService siteService) {
        this.siteService = siteService;
    }

    @GetMapping
    public List<Site> getAllSites() {
        return siteService.getAllSites();
    }

    @GetMapping("/{id}")
    public Site getSite(@PathVariable Integer id) {
        return siteService.getSiteById(id)
                .orElseThrow(() -> new RuntimeException("Site not found"));
    }

    @PostMapping
    public Site createSite(@RequestBody Site site) {
        return siteService.createSite(site);
    }

    @PutMapping("/{id}")
    public Site updateSite(@PathVariable Integer id, @RequestBody Site site) {
        return siteService.updateSite(id, site);
    }

    @DeleteMapping("/{id}")
    public void deleteSite(@PathVariable Integer id) {
        siteService.deleteSite(id);
    }
}
