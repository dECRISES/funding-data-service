package org.dfm.funding.data.service.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", strict = true, plugin = {"json:target/cucumber/fundingDataService.json", "json:target/cucumber/fundingDataService.xml"}, tags = {
    "@FundingData Service"}, glue = "classpath:org.dfm.funding.data.service.cucumber")
public class RunCucumberFundingData ServiceTest {

}
