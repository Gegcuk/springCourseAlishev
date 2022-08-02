package ru.gegcuk.webapp1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rockMusic")
public class RockMusic implements Music{
    @Override
    public String getSong() { return "Wind of change"; }

    @PostConstruct
    private void doMyInit(){ System.out.println("I'm creating" + this.getClass()); }

    @PreDestroy
    private void doMyDestroy(){ System.out.println("I'm destroying" + this.getClass()); }
}
