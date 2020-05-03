package com.yulikarate.test.testruns;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.Assert.*;
import org.junit.Test;


public class ParallelRunner {

    @Test
    public void testParallel() {
        Results results = Runner.path("classpath:features").tags("~@ignore").parallel(5);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }
}