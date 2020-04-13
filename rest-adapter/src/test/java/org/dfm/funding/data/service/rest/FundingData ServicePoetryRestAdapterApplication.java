package org.dfm.funding.data.service.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.dfm.funding.data.service.domain.port.RequestFundingData Service;

@SpringBootApplication
@ComponentScan(basePackages = "org.dfm.funding.data.service")
public class FundingData ServicePoetryRestAdapterApplication {

  @MockBean
  private RequestFundingData Service requestFundingData Service;

  public static void main(String[] args) {
    SpringApplication.run(FundingData ServicePoetryRestAdapterApplication.class, args);
  }
}
