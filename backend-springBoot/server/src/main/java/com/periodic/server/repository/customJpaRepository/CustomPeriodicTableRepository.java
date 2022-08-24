package com.periodic.server.repository.customJpaRepository;

import java.util.List;

import com.periodic.server.model.entity.Periodic;
import com.periodic.server.model.projection.PeriodicTableProj;

public interface CustomPeriodicTableRepository {
    List<PeriodicTableProj> selectAtomList();

    Periodic selectDetailInfo(String atomName);
}
