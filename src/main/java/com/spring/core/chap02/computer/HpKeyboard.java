package com.spring.core.chap02.computer;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class HpKeyboard implements Keyboard {
    @Override
    public void info() {
        System.out.println("hp 키보드입니다.");
    }
}
