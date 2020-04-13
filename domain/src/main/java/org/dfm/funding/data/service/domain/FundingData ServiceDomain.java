package org.dfm.funding.data.service.domain;

import org.dfm.funding.data.service.domain.model.FundingData ServiceInfo;
import org.dfm.funding.data.service.domain.port.ObtainFundingData Service;
import org.dfm.funding.data.service.domain.port.RequestFundingData Service;

public class FundingData ServiceDomain implements RequestFundingData Service {

  private ObtainFundingData Service obtainFundingData Service;

  public FundingData ServiceDomain() {
    this(new ObtainFundingData Service() {
    });
  }

  public FundingData ServiceDomain(ObtainFundingData Service obtainFundingData Service) {
    this.obtainFundingData Service = obtainFundingData Service;
  }

  @Override
  public FundingData ServiceInfo getFundingData Services() {
    return FundingData ServiceInfo.builder().fundingDataServices(obtainFundingData Service.getAllFundingData Services()).build();
  }
}
