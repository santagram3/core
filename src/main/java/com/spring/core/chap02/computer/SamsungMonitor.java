package com.spring.core.chap02.computer;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class SamsungMonitor implements Monitor {
    @Override
    public void info() {
        System.out.println("삼성 모니터입니다.");
    }

    @Override
    public void showShow() {
        System.out.println("삼성전자의 모니터를 보여드리겠습니다.");
    }
}
