package com.spring.core.chap02.computer;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class LogitecMouse implements Mouse {

    @Override
    public void info() {
        System.out.println("로지텍 마우스입니다.");
    }
}
