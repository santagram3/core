package com.spring.core.chap02.computer.config;


import com.spring.core.chap02.computer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {

    @Bean
    public Monitor monitor(){
        return new LgMonitor();
    }
    @Bean
    public Mouse mouse(){
        return new LogitecMouse();
    }
    @Bean Keyboard keyboard(){
        return new HpKeyboard();
    }

    @Bean
    public Computer computer(){
        return new Computer(keyboard(),mouse(),monitor());
    }



}
