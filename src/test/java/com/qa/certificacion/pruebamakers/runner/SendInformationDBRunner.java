package com.qa.certificacion.pruebamakers.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/send.feature"
,glue="com.qa.certificacion.pruebamakers.stepsdefinitions"
,snippets=SnippetType.CAMELCASE
)

public class SendInformationDBRunner {

}
