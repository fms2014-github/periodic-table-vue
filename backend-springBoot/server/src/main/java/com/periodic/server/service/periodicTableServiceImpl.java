package com.periodic.server.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.periodic.server.model.dto.PeriodicTableRes;
import com.periodic.server.model.entity.Periodic;
import com.periodic.server.repository.JpaRepository.PeriodicTableRepository;

import lombok.RequiredArgsConstructor;

@Service("PeriodicTableService")
@RequiredArgsConstructor
public class periodicTableServiceImpl implements PeriodicTableService {

    private final PeriodicTableRepository periodicTableRepository;

    @Override
    public List<PeriodicTableRes> atomList() throws Exception {
        // TODO Auto-generated method stub

        return periodicTableRepository.selectAtomList();
    }

    @Override
    public Periodic atomDetail(Object o1) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Periodic atomInfo(Object o1) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @Transactional
    public int insertPeriodic(Periodic periodic) throws Exception {
        // TODO Auto-generated method stub
        periodicTableRepository.save(periodic);
        return 0;
    }
}
