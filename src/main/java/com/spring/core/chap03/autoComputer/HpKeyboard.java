package com.spring.core.chap03.autoComputer;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter
@Getter
@Component
public class HpKeyboard implements Keyboard {
    @Override
    public void info() {
        System.out.println("hp 키보드입니다.");
    }
}
