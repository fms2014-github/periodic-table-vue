package com.periodic.server.repository.customJpaRepository;

import java.util.List;

import com.periodic.server.model.dto.PeriodicTableRes;

public interface CustomPeriodicTableRepository {
    List<PeriodicTableRes> selectAtomList();
}
