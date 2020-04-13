package org.dfm.funding.data.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.dfm.funding.data.service.domain.FundingData ServiceDomain;
import org.dfm.funding.data.service.domain.model.FundingData Service;
import org.dfm.funding.data.service.domain.model.FundingData ServiceInfo;
import org.dfm.funding.data.service.domain.port.ObtainFundingData Service;
import org.dfm.funding.data.service.domain.port.RequestFundingData Service;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class AcceptanceTest {

  @Test
  @DisplayName("should be able to get fundingDataServices when asked for fundingDataServices from hard coded fundingDataServices")
  public void getFundingData ServicesFromHardCoded() {
  /*
      RequestFundingData Service    - left side port
      FundingData ServiceDomain     - hexagon (domain)
      ObtainFundingData Service     - right side port
   */
    RequestFundingData Service requestFundingData Service = new FundingData ServiceDomain(); // the poem is hard coded
    FundingData ServiceInfo fundingDataServiceInfo = requestFundingData Service.getFundingData Services();
    assertThat(fundingDataServiceInfo).isNotNull();
    assertThat(fundingDataServiceInfo.getFundingData Services()).isNotEmpty().extracting("description")
        .contains("If you could read a leaf or tree\r\nyoud have no need of books.\r\n-- Alistair Cockburn (1987)");
  }

  @Test
  @DisplayName("should be able to get fundingDataServices when asked for fundingDataServices from stub")
  public void getFundingData ServicesFromMockedStub(@Mock ObtainFundingData Service obtainFundingData Service) {
    // Stub
    FundingData Service fundingDataService = FundingData Service.builder().id(1L).description("I want to sleep\r\nSwat the flies\r\nSoftly, please.\r\n\r\n-- Masaoka Shiki (1867-1902)").build();
    Mockito.lenient().when(obtainFundingData Service.getAllFundingData Services()).thenReturn(List.of(fundingDataService));
    // hexagon
    RequestFundingData Service requestFundingData Service = new FundingData ServiceDomain(obtainFundingData Service);
    FundingData ServiceInfo fundingDataServiceInfo = requestFundingData Service.getFundingData Services();
    assertThat(fundingDataServiceInfo).isNotNull();
    assertThat(fundingDataServiceInfo.getFundingData Services()).isNotEmpty().extracting("description")
        .contains("I want to sleep\r\nSwat the flies\r\nSoftly, please.\r\n\r\n-- Masaoka Shiki (1867-1902)");
  }
}
