package com.zulal.sitecrew.service;
 
import org.springframework.stereotype.Service;

import com.zulal.sitecrew.model.Site;
import com.zulal.sitecrew.repository.SiteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SiteService {

    private final SiteRepository siteRepository;

    public SiteService(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }

    public List<Site> getAllSites() {
        return siteRepository.findAll();
    }

    public Optional<Site> getSiteById(Integer id) {
        return siteRepository.findById(id);
    }

    public Site createSite(Site site) {
        return siteRepository.save(site);
    }

    public Site updateSite(Integer id, Site updatedSite) {
        return siteRepository.findById(id)
                .map(site -> {
                    site.setName(updatedSite.getName());
                    site.setLocation(updatedSite.getLocation());
                    return siteRepository.save(site);
                })
                .orElseThrow(() -> new RuntimeException("Site not found"));
    }

    public void deleteSite(Integer id) {
        siteRepository.deleteById(id);
    }
}
