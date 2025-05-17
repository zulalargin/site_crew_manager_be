package com.zulal.sitecrew.service;

import com.zulal.sitecrew.dto.PersonnelUpdateRequest;
import com.zulal.sitecrew.model.Personnel;
import com.zulal.sitecrew.repository.PersonnelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonnelService {

    private final PersonnelRepository personnelRepository;

    public PersonnelService(PersonnelRepository personnelRepository) {
        this.personnelRepository = personnelRepository;
    }

    public List<Personnel> getAll() {
        return personnelRepository.findAll();
    }

    public List<Personnel> getBySiteId(Integer siteId) {
        return personnelRepository.findBySiteId(siteId);
    }

    public Optional<Personnel> getById(Integer id) {
        return personnelRepository.findById(id);
    }

    public Personnel save(Personnel p) {
        return personnelRepository.save(p);
    }


    public Personnel updateSite(Integer personnelId, Integer siteId) {
        Personnel personnel = personnelRepository.findById(personnelId)
                .orElseThrow(() -> new RuntimeException("Personnel not found"));

       
        personnel.setSiteId(siteId);

        return personnelRepository.save(personnel);
    }
    
    public Personnel updateSiteAndStatus(Integer id, Integer siteId, String status) {
        Personnel p = personnelRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Personnel not found with id " + id));

        p.setSiteId(siteId);
        p.setStatus(status);
        return personnelRepository.save(p);
    }

    public Personnel updatePersonnel(Integer id, PersonnelUpdateRequest req) {
        Personnel p = personnelRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Personel bulunamadı"));

        p.setName(req.getName());
        p.setRole(req.getRole());
        p.setPosition(req.getPosition());
        p.setNationality(req.getNationality());
        p.setVisaStatus(req.getVisaStatus());
        p.setSalary(req.getSalary());

        return personnelRepository.save(p);
    }

    public void delete(Integer id) {
        personnelRepository.deleteById(id);
    }




}
