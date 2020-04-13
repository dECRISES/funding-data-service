package org.dfm.funding.data.service.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.dfm.funding.data.service.domain.FundingData ServiceDomain;
import org.dfm.funding.data.service.domain.port.ObtainFundingData Service;
import org.dfm.funding.data.service.domain.port.RequestFundingData Service;
import org.dfm.funding.data.service.repository.config.JpaAdapterConfig;

@Configuration
@Import(JpaAdapterConfig.class)
public class BootstrapConfig {

  @Bean
  public RequestFundingData Service getRequestFundingData Service(ObtainFundingData Service obtainFundingData Service) {
    return new FundingData ServiceDomain(obtainFundingData Service);
  }
}
