package com.periodic.server.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.periodic.server.model.projection.PeriodicTableProj;
import com.periodic.server.model.entity.Periodic;
import com.periodic.server.repository.JpaRepository.PeriodicTableRepository;

import lombok.RequiredArgsConstructor;

@Service("PeriodicTableService")
@RequiredArgsConstructor
public class periodicTableServiceImpl implements PeriodicTableService {

    private final PeriodicTableRepository periodicTableRepository;

    @Override
    public List<PeriodicTableProj> atomList() throws Exception {
        // TODO Auto-generated method stub
        List<PeriodicTableProj> beforeSortList = periodicTableRepository.selectAtomList();

        Collections.sort(beforeSortList, (o1, o2) -> {
            // TODO Auto-generated method stub
            int i1 = Integer.parseInt(o1.getAtomNum());
            int i2 = Integer.parseInt(o2.getAtomNum());

            if (i1 < i2) {
                return -1;
            } else if (i1 == i2) {
                return 0;
            } else {
                return 1;
            }

        });

        return beforeSortList;
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
