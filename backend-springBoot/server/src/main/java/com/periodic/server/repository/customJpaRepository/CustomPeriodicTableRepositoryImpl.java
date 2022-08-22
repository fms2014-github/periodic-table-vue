package com.periodic.server.repository.customJpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.periodic.server.model.dto.PeriodicTableRes;
import com.periodic.server.model.entity.Periodic;
import com.periodic.server.model.entity.QPeriodic;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQueryFactory;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class CustomPeriodicTableRepositoryImpl extends QuerydslRepositorySupport
        implements CustomPeriodicTableRepository {

    private JPQLQueryFactory queryFactory;

    public CustomPeriodicTableRepositoryImpl() {
        super(Periodic.class);

    }

    @Override
    public List<PeriodicTableRes> selectAtomList() {

        QPeriodic periodic = QPeriodic.periodic;
        queryFactory = new JPAQueryFactory(getEntityManager());
        return queryFactory.select(Projections.fields(PeriodicTableRes.class, periodic.atomNum, periodic.atomName))
                .from(periodic).fetch();
    }

}
