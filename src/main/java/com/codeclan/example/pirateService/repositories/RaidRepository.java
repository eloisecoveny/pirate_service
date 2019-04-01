package com.codeclan.example.pirateService.repositories;

import com.codeclan.example.pirateService.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaidRepository extends JpaRepository<Raid, Long> {
}
