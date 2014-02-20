package com.BrightTalk.Features;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
format={"html:target/BrightTalkcucumber"},
tags ="@Login,@contentExplorer,@Signup")
public class CucumberRunFeatures {}


