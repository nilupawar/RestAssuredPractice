package com.nilesh.practice;

public class NonJunitCucumberTestRunner {
    public static void main(String[] args){

        args = new String[]{"--glue","com.nilesh.practice",
                            "--glue","com.nilesh.practiceMore",
                            "--tags","@DummyTest","classpath:"};


        cucumber.api.cli.Main.main(args);
    }
}
