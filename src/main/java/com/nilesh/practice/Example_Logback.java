package com.nilesh.practice;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example_Logback {
    private static final Logger LOGGER = LoggerFactory.getLogger(Example_CreateJSONObject.class);

    public static void main(String[] args){

        printLogbackConfigStatus();
        LOGGER.info("Starte Json Pratice again");

    }
    //---------------------------------------------------------------------------
    // This method will print the status of the logback configuration
    private static void printLogbackConfigStatus(){

        // assume SLF4J is bound to logback in the current environment
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        // print logback's internal status
        StatusPrinter.print(lc);
    }
}
