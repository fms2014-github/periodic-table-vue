package com.periodic.server.service;

import java.util.List;

import com.periodic.server.model.projection.PeriodicTableProj;
import com.periodic.server.model.entity.Periodic;

public interface PeriodicTableService {
    List<PeriodicTableProj> atomList();

    Periodic atomDetail(String atomName);

    int insertPeriodic(Periodic periodic);

}
