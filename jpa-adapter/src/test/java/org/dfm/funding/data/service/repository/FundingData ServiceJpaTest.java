package org.dfm.funding.data.service.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.dfm.funding.data.service.domain.model.FundingData Service;
import org.dfm.funding.data.service.domain.port.ObtainFundingData Service;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class FundingData ServiceJpaTest {

  @Autowired
  private ObtainFundingData Service obtainFundingData Service;

  @Test
  @DisplayName("should start the application")
  public void startup() {
    assertThat(Boolean.TRUE).isTrue();
  }

  @Sql(scripts = {"/sql/data.sql"})
  @Test
  @DisplayName("should give me fundingDataServices when asked for fundingDataServices from database")
  public void shouldGiveMeFundingData ServicesWhenAskedForFundingData Services() {
    // Given from @Sql
    // When
    List<FundingData Service> fundingDataServices = obtainFundingData Service.getAllFundingData Services();
    // Then
    assertThat(fundingDataServices).isNotNull().extracting("description").contains("Twinkle twinkle little star");
  }
}
