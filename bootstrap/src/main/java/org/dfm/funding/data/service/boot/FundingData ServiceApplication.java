package org.dfm.funding.data.service.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.dfm.funding.data.service")
public class FundingData ServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(FundingData ServiceApplication.class, args);
  }
}
