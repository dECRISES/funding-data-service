package org.dfm.funding.data.service.cucumber;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;
import io.cucumber.java8.HookNoArgsBody;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.dfm.funding.data.service.FundingData ServiceE2EApplication;
import org.dfm.funding.data.service.domain.model.FundingData Service;
import org.dfm.funding.data.service.domain.model.FundingData ServiceInfo;
import org.dfm.funding.data.service.repository.dao.FundingData ServiceDao;
import org.dfm.funding.data.service.repository.entity.FundingData ServiceEntity;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = FundingData ServiceE2EApplication.class, webEnvironment = RANDOM_PORT)
@ContextConfiguration(classes = FundingData ServiceE2EApplication.class, loader = SpringBootContextLoader.class)
public class FundingData ServiceStepDef implements En {

  private static final String LOCALHOST = "http://localhost:";
  private static final String API_URI = "/api/v1/fundingDataServices";
  @LocalServerPort
  private int port;
  private ResponseEntity<FundingData ServiceInfo> responseEntity;

  public FundingData ServiceStepDef(TestRestTemplate restTemplate, FundingData ServiceDao poetryDao) {

    DataTableType((Map<String, String> row) -> FundingData Service.builder().description(row.get("description")).build());
    DataTableType((Map<String, String> row) -> FundingData ServiceEntity.builder().description(row.get("description")).build());

    Before((HookNoArgsBody) poetryDao::deleteAll);
    After((HookNoArgsBody) poetryDao::deleteAll);

    Given("the following fundingDataServices exists in the library", (DataTable dataTable) -> {
      List<FundingData ServiceEntity> poems = dataTable.asList(FundingData ServiceEntity.class);
      poetryDao.saveAll(poems);
    });

    When("user requests for all fundingDataServices", () -> {
      String url = LOCALHOST + port + API_URI;
      responseEntity = restTemplate.getForEntity(url, FundingData ServiceInfo.class);
    });

    Then("the user gets the following fundingDataServices", (DataTable dataTable) -> {
      List<FundingData Service> expectedFundingData ServiceInfo = dataTable.asList(FundingData Service.class);
      assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
      assertThat(responseEntity.getBody()).isNotNull();
      assertThat(responseEntity.getBody().getFundingData Services()).isNotEmpty().extracting("description")
          .contains(expectedFundingData ServiceInfo.stream().map(FundingData Service::getDescription).toArray());
    });
  }
}


