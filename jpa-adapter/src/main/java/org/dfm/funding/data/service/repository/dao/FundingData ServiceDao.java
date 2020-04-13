package org.dfm.funding.data.service.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.dfm.funding.data.service.repository.entity.FundingData ServiceEntity;

@Repository
public interface FundingData ServiceDao extends JpaRepository<FundingData ServiceEntity, Long> {

}
