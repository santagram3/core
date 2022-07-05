package com.spring.core.chap02.computer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter @Getter

public class AppleMouse implements Mouse {
    @Override
    public void info() {
        System.out.println("애플 마우스입니다.");
    }
}
