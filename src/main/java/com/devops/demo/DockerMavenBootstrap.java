package com.devops.demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author john
 */
@SpringBootApplication
public class DockerMavenBootstrap {
    public static void main(String[] args) {
        //使用内置tomcat启动
        new SpringApplicationBuilder(DockerMavenBootstrap.class).web(WebApplicationType.SERVLET).run(args);
    }
}