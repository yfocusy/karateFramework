package com.yulikarate.test.testruns;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
//import com.intuit.karate.testng.KarateRunner;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Karate.class)
//@CucumberOptions(features = "classpath:features",format={"pretty","html:reports","json:report.json"})
@KarateOptions(features = "classpath:features", tags = "~@ignore")

//@CucumberOptions(tags = {"@t1","@t2"}, format={"pretty","html:reports","json:report.json"})


//public class DemoRunner extends KarateRunner {
//
//}
public class DemoRunner {

}