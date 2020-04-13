package org.dfm.funding.data.service.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.dfm.funding.data.service.domain.model.FundingData ServiceInfo;
import org.dfm.funding.data.service.domain.port.RequestFundingData Service;

@RestController
@RequestMapping("/api/v1/fundingDataServices")
public class FundingData ServiceResource {

  private RequestFundingData Service requestFundingData Service;

  public FundingData ServiceResource(RequestFundingData Service requestFundingData Service) {
    this.requestFundingData Service = requestFundingData Service;
  }

  @GetMapping
  public ResponseEntity<FundingData ServiceInfo> getFundingData Services() {
    return ResponseEntity.ok(requestFundingData Service.getFundingData Services());
  }
}
