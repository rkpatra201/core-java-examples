package com.java;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class TestSuiteRunner {
    public static void main(String[] args) {
     Result result = JUnitCore.runClasses(AppSuiteTest.class);
        List<Failure> failures = result.getFailures();
        for(Failure f: failures)
        {
            System.out.println(f);
        }
        System.out.println(result.wasSuccessful());
        System.out.println(result.getRunCount());
        System.out.println(result.getIgnoreCount());
        System.out.println(result.getFailureCount());
    }
}
