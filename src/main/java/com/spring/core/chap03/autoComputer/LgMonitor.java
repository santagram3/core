package com.spring.core.chap03.autoComputer;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter

public class LgMonitor implements Monitor {
    @Override
    public void info() {
        System.out.println("LG 모니터입니다.");
    }

    @Override
    public void showShow() {
        System.out.println("lg주가를 보여드리겠습니다.");
    }
}
