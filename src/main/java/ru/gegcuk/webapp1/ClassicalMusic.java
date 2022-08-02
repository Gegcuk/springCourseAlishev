package ru.gegcuk.webapp1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("classicalMusic")
@Scope("prototype")
public class ClassicalMusic implements Music{

    @Override
    public String getSong() { return "Symphony #5"; }

    @PostConstruct
    private void doMyInit(){ System.out.println("I'm creating" + this.getClass()); }

    @PreDestroy
    private void doMyDestroy(){ System.out.println("I'm destroying" + this.getClass()); }

}
