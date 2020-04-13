package org.dfm.funding.data.service.repository.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.dfm.funding.data.service.domain.port.ObtainFundingData Service;
import org.dfm.funding.data.service.repository.FundingData ServiceRepository;
import org.dfm.funding.data.service.repository.dao.FundingData ServiceDao;

@Configuration
@EntityScan("org.dfm.funding.data.service.repository.entity")
@EnableJpaRepositories("org.dfm.funding.data.service.repository.dao")
public class JpaAdapterConfig {

  @Bean
  public ObtainFundingData Service getFundingData ServiceRepository(FundingData ServiceDao fundingDataServiceDao) {
    return new FundingData ServiceRepository(fundingDataServiceDao);
  }
}
