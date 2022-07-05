package com.spring.core.chap02.config;


import com.spring.core.chap02.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// 스프링 컨테이너에 스프링 빈을 등록하는 설정 파일
@Configuration // 이 파일은 설정 파일입니다. // 구성
public class HotelConfig {

    // 빈등록 방식 - 생성자 주입, 세터 주입
    // 메서드 이름은 아무거나해도 상관없음
    @Bean
    public Chef chef(){
        return new KimuraChef();
    }
    @Bean(name = "sc")
    public Course sushiCourse(){
        return new SushiCourse();
    }

    @Bean(name = "fc")
    public Course frenchCourse(){
        return new FranchCourse();
    }

    @Bean(name = "res")// 빈이름 짓기 안지으면 메서드명을 자동으로 설정
    public Restaurant restaurant(){
        //  생성자 주입 이 수정자 주입보다 안전하다
//        // 생성자 주입 (constructor injection)
//        EasternRestaurant er = new EasternRestaurant(chef(), sushiCourse());
        // 수정자 주입 (setter injection)
        EasternRestaurant er = new EasternRestaurant();
        er.setChef(chef());
        er.setCourse(sushiCourse());
        return er;
    }

    @Bean
    public Hotel hotel(){
        return new Hotel(restaurant(),chef());
    }








}
