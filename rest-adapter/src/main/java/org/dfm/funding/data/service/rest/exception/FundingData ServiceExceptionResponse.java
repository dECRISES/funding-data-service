package org.dfm.funding.data.service.rest.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FundingData ServiceExceptionResponse {

  private String message;

  private String path;
}
