package org.dfm.funding.data.service.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.dfm.funding.data.service.domain.model.FundingData Service;
import org.dfm.funding.data.service.domain.model.FundingData ServiceInfo;
import org.dfm.funding.data.service.domain.port.RequestFundingData Service;

@ExtendWith(MockitoExtension.class)
@SpringBootTest(classes = FundingData ServicePoetryRestAdapterApplication.class, webEnvironment = RANDOM_PORT)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class FundingData ServiceResourceTest {

  private static final String LOCALHOST = "http://localhost:";
  private static final String API_URI = "/api/v1/fundingDataServices";
  @LocalServerPort
  private int port;
  @Autowired
  private TestRestTemplate restTemplate;
  @Autowired
  private RequestFundingData Service requestFundingData Service;

  @Test
  @DisplayName("should start the rest adapter application")
  public void startup() {
    assertThat(Boolean.TRUE).isTrue();
  }

  @Test
  @DisplayName("should give fundingDataServices when asked for fundingDataServices with the support of domain stub")
  public void obtainFundingData ServicesFromDomainStub() {
    // Given
    FundingData Service fundingDataService = FundingData Service.builder().id(1L).description("Johnny Johnny Yes Papa !!").build();
    Mockito.lenient().when(requestFundingData Service.getFundingData Services()).thenReturn(FundingData ServiceInfo.builder().fundingDataServices(List.of(fundingDataService)).build());
    // When
    String url = LOCALHOST + port + API_URI;
    ResponseEntity<FundingData ServiceInfo> responseEntity = restTemplate.getForEntity(url, FundingData ServiceInfo.class);
    // Then
    assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(responseEntity.getBody()).isNotNull();
    assertThat(responseEntity.getBody().getFundingData Services()).isNotEmpty().extracting("description")
        .contains("Johnny Johnny Yes Papa !!");
  }
}
