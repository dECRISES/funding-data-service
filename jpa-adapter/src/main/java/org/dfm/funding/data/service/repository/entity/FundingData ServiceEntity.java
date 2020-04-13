package org.dfm.funding.data.service.repository.entity;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dfm.funding.data.service.domain.model.FundingData Service;

@Table(name = "T_FUNDING_DATA_SERVICE")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FundingData ServiceEntity {

  @Id
  @GeneratedValue(strategy = AUTO)
  private Long id;

  @Column(name = "DESCRIPTION")
  private String description;

  public FundingData Service toModel() {
    return FundingData Service.builder().id(id).description(description).build();
  }
}
