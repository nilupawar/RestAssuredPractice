package com.nilesh.practice;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.net.URLClassLoader;

public class Example_GetClassPath {
    public static void main(String[] args){

            ClassLoader cl = ClassLoader.getSystemClassLoader();

            URL[] urls = ((URLClassLoader)cl).getURLs();

            for(URL url: urls){
                System.out.println(url.getFile());
            }


    }
}
