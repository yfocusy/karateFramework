package com.yulikarate.test.testruns;

import com.intuit.karate.junit4.Karate;
import com.intuit.karate.testng.KarateRunner;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


//@RunWith(Karate.class)
////@CucumberOptions(features = "classpath:com.yulikarate.test.testruns/demo/demo.feature" ,format={"pretty","html:reports","json:report.json"})
//@CucumberOptions(features = "src/test/resources/demo.feature" ,format={"pretty","html:reports","json:report.json"})
//
//public class DemoRunner extends KarateRunner {
//
//}


@RunWith(Karate.class)
@CucumberOptions(features = "classpath:resources/weather.feature",format={"pretty","html:reports","json:report.json"})

public class DemoRunner extends KarateRunner {

}
