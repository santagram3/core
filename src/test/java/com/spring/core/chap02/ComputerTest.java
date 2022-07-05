package com.spring.core.chap02;

import com.spring.core.chap02.computer.Computer;

import com.spring.core.chap02.computer.Monitor;
import com.spring.core.chap02.computer.config.ComputerConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {


    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ComputerConfig.class);
        // e등록되어언
    @Test
    @DisplayName("서로 잘 맞물려있나 확인되어야한다 ")
    void findBeanTest(){

        Computer comp = ac.getBean(Computer.class);
        comp.showSpec();
    }

    @Test
    @DisplayName(" 주가얘기를 떠들어야 한다  ")
    void findBeanByType(){

        Monitor mo = ac.getBean(Monitor.class);
        mo.showShow();

    }


    @Test
    @DisplayName("컨테이너에서 조회한 빈은 단 하나의 객체여야 한다.")
    void singleton() {
        AnnotationConfigApplicationContext ac
                = new AnnotationConfigApplicationContext(ComputerConfig.class);

        Monitor m1 = ac.getBean(Monitor.class);
        Monitor m2 = ac.getBean(Monitor.class);
        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);

        assertEquals(m1, m2);
    }
}

