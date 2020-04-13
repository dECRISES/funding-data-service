package org.dfm.funding.data.service.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.dfm.funding.data.service.domain.port.ObtainFundingData Service;
import org.dfm.funding.data.service.repository.dao.FundingData ServiceDao;

@SpringBootApplication
public class FundingData ServiceJpaAdapterApplication {

  public static void main(String[] args) {
    SpringApplication.run(FundingData ServiceJpaAdapterApplication.class, args);
  }

  @TestConfiguration
  static class FundingData ServiceJpaTestConfig {

    @Bean
    public ObtainFundingData Service getObtainFundingData ServiceRepository(FundingData ServiceDao fundingDataServiceDao) {
      return new FundingData ServiceRepository(fundingDataServiceDao);
    }
  }
}
