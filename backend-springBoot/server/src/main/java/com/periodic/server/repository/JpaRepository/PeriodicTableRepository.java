package com.periodic.server.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.periodic.server.model.entity.Periodic;
import com.periodic.server.repository.customJpaRepository.CustomPeriodicTableRepository;

public interface PeriodicTableRepository extends JpaRepository<Periodic, String>, CustomPeriodicTableRepository {

}
