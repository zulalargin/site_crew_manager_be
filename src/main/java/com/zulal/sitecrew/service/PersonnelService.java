package com.zulal.sitecrew.service;

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


}
