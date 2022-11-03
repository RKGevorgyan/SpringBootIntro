package com.example.springbootintro.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        value = {"classpath:springBootIntro.properties"},
        ignoreResourceNotFound = true)
public class AppConfig {
    // JPA ~ hibernate

    // JPA ~ Spring Data
}
