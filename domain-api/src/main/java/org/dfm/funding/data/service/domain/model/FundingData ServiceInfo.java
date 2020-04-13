package org.dfm.funding.data.service.domain.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FundingData ServiceInfo {

  private List<FundingData Service> fundingDataServices;
}
