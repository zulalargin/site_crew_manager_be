package com.zulal.sitecrew.repository;

import com.zulal.sitecrew.model.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PersonnelRepository extends JpaRepository<Personnel, Integer> {
    List<Personnel> findBySiteId(Integer siteId);
    
}
