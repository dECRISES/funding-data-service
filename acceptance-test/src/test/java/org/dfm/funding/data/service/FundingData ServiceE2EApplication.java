package org.dfm.funding.data.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.dfm.funding.data.service.domain.FundingData ServiceDomain;
import org.dfm.funding.data.service.domain.port.ObtainFundingData Service;
import org.dfm.funding.data.service.domain.port.RequestFundingData Service;
import org.dfm.funding.data.service.repository.config.JpaAdapterConfig;

@SpringBootApplication
public class FundingData ServiceE2EApplication {

  public static void main(String[] args) {
    SpringApplication.run(FundingData ServiceE2EApplication.class);
  }

  @TestConfiguration
  @Import(JpaAdapterConfig.class)
  static class FundingData ServiceConfig {

    @Bean
    public RequestFundingData Service getRequestFundingData Service(final ObtainFundingData Service obtainFundingData Service) {
      return new FundingData ServiceDomain(obtainFundingData Service);
    }
  }
}
