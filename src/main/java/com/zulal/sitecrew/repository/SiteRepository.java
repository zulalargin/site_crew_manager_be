package com.zulal.sitecrew.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zulal.sitecrew.model.Site;

public interface SiteRepository extends JpaRepository<Site, Integer> {
}
