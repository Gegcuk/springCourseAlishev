package ru.gegcuk.webapp1;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music{
    @Override
    public String getSong() { return "Wind of change"; }
}
