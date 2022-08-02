package ru.gegcuk.webapp1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.gegcuk.webapp1")
@PropertySource("classpath:musicPlayer.properties")
public class SpringCongig {
}
