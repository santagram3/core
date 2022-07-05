package com.spring.core.chap03.autoComputer;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class SamsungKeyboard implements Keyboard {
    @Override
    public void info() {
        System.out.println("삼성 키보드입니다.");
    }
}
