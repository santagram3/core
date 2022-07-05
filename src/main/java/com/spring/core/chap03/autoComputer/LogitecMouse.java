package com.spring.core.chap03.autoComputer;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter
@Getter
@Component
public class LogitecMouse implements Mouse {

    @Override
    public void info() {
        System.out.println("로지텍 마우스입니다.");
    }
}
