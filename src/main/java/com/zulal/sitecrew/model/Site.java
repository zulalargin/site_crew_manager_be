package com.zulal.sitecrew.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Site_Sites")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "worker_count")
    private Integer workerCount;

    @Column(name = "engineer_count")
    private Integer engineerCount;

    private String name;
    private String location;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(Integer workerCount) {
        this.workerCount = workerCount;
    }

    public Integer getEngineerCount() {
        return engineerCount;
    }

    public void setEngineerCount(Integer engineerCount) {
        this.engineerCount = engineerCount;
    }
}
