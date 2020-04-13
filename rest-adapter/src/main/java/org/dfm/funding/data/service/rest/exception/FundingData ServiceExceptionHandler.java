package org.dfm.funding.data.service.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.dfm.funding.data.service.domain.exception.FundingData ServiceNotFoundException;

@RestControllerAdvice(basePackages = {"org.dfm.funding.data.service"})
public class FundingData ServiceExceptionHandler {

  @ExceptionHandler(value = FundingData ServiceNotFoundException.class)
  public final ResponseEntity<FundingData ServiceExceptionResponse> handleFundingData ServiceNotFoundException(final WebRequest request) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(FundingData ServiceExceptionResponse.builder().message("FundingData Service not found").path(((ServletWebRequest) request).getRequest().getRequestURI()).build());
  }
}
