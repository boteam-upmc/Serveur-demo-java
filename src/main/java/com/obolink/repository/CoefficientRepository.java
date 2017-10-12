package com.obolink.repository;

import com.obolink.domain.ClientCoefficient;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by lijuan on 12/10/17.
 */
@Repository
public interface CoefficientRepository extends PagingAndSortingRepository<ClientCoefficient, String>,QueryDslPredicateExecutor<ClientCoefficient>{

    ClientCoefficient findByClientId(@Param(value = "clientId") String clientId);
}
