package com.spring.core.chap03.autoComputer.config;


import com.spring.core.chap03.autoComputer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.chap03.computer")
public class ComputerAutoConfig {

    @Bean
    public Monitor monitor(){
        return new LgMonitor();
    }
    @Bean
    public Mouse mouse(){
        return new LogitecMouse();
    }
    @Bean
    Keyboard keyboard(){
        return new HpKeyboard();
    }

    @Bean
    public Computer computer(){
        return new Computer(keyboard(),mouse(),monitor());
    }



}
