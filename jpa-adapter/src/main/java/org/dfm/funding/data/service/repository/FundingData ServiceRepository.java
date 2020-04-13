package org.dfm.funding.data.service.repository;

import java.util.List;
import java.util.stream.Collectors;
import org.dfm.funding.data.service.domain.model.FundingData Service;
import org.dfm.funding.data.service.domain.port.ObtainFundingData Service;
import org.dfm.funding.data.service.repository.dao.FundingData ServiceDao;
import org.dfm.funding.data.service.repository.entity.FundingData ServiceEntity;

public class FundingData ServiceRepository implements ObtainFundingData Service {

  private FundingData ServiceDao fundingDataServiceDao;

  public FundingData ServiceRepository(FundingData ServiceDao fundingDataServiceDao) {
    this.fundingDataServiceDao = fundingDataServiceDao;
  }

  @Override
  public List<FundingData Service> getAllFundingData Services() {
    return fundingDataServiceDao.findAll().stream().map(FundingData ServiceEntity::toModel).collect(Collectors.toList());
  }
}
