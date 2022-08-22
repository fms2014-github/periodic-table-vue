package com.periodic.server.service;

import java.util.List;

import com.periodic.server.model.dto.PeriodicTableRes;
import com.periodic.server.model.entity.Periodic;

public interface PeriodicTableService {
    List<PeriodicTableRes> atomList() throws Exception;

    Periodic atomDetail(Object o1) throws Exception;

    Periodic atomInfo(Object o1) throws Exception;

    int insertPeriodic(Periodic periodic) throws Exception;

}
