package org.dfm.funding.data.service.domain.port;

import java.util.List;
import org.dfm.funding.data.service.domain.model.FundingData Service;

public interface ObtainFundingData Service {

  default List<FundingData Service> getAllFundingData Services() {
    FundingData Service fundingDataService = FundingData Service.builder().id(1L).description("If you could read a leaf or tree\r\nyoud have no need of books.\r\n-- Alistair Cockburn (1987)").build();
    return List.of(fundingDataService);
  }
}
