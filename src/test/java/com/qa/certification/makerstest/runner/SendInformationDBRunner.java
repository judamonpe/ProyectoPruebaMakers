package com.qa.certification.makerstest.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/send.feature"
,glue="com.qa.certification.makerstest.stepsdefinitions"
,snippets=SnippetType.CAMELCASE
)

public class SendInformationDBRunner {

}
