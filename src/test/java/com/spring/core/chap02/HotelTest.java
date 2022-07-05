package com.spring.core.chap02;

import com.spring.core.chap02.config.HotelConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {


    // 스프링 컨테이너에서 빈 가져오기
    // HotelConfig.class = HotelConfig 의 메타정보를 가져옴
    //  Annotation = @
    // 골뱅이 붙여져있는 애들을 가져옴
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(HotelConfig.class);


    @Test
    @DisplayName("스프링 컨테이너에 등록된 빈들의 의존관계가 잘 결합되어 있어야 한다 ")
    void beanTest() {

        Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();

    }

    @Test
    @DisplayName("등록된 빈의 타입으로 빈을 가져와야 한다 ")
    void findBeanByType() {

        Chef chef = ac.getBean(Chef.class);
        chef.cook();

//        Assertions.assertInstanceOf(KimuraChef.class, chef); Assertions 에 알트 엔터
        // 나는 chef의 실제 인스턴스가 kimuraChef일거라고 단언한다
        assertInstanceOf(KimuraChef.class, chef);

        // 나는 chef의 실제 인스턴스가 kimChef일거라고 단언한다
        // 이건 오류남
       // assertInstanceOf(KimChef.class, chef);
        //Unexpected type 이렇게
    }


    @Test
    @DisplayName("등록된 빈의 이름으로 빈을 가져와야 한다 ")
    void findBeanByName() {

        //빈의 이름은 따로 정해놓지 않으면 등록 메서드명이 이름이 된다
//        Restaurant restaurant = (Restaurant) ac.getBean("restaurant");
        Restaurant restaurant = (Restaurant) ac.getBean("res");
//        Assertions.assertInstanceOf(Restaurant.class, restaurant);
        assertInstanceOf(Restaurant.class, restaurant);
    }


    @Test
    @DisplayName("등록된 빈의 타입이 중복이면 빈의 이름과 타입으로 조히하면 된다. ")
    void findBeanByDuplicateType2() {

        Course course = ac.getBean("sc", Course.class);
        course.combineMenu();
        assertInstanceOf(SushiCourse.class, course);

    }


    @Test
    @DisplayName("등록된 빈의 타입이 중복이면 예외가 발생한다  ")
    void findBeanByDuplicateType() {

//        Course course = ac.getBean(Course.class);
        //오류
//        org.springframework.beans.factory.NoUniqueBeanDefinitionException:
//        No qualifying bean of type 'com.spring.core.chap02.Course'
//        available:
//        expected single matching bean but found 2:sushiCourse, frenchCourse

        //예외 발생 테스트

//        Assertions.assertThrows(NoUniqueBeanDefinitionException.class , () -> ac.getBean(Course.class));

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> ac.getBean(Course.class));
//        Assertions.assertThrows()  쓰고 예외 상황쓰고 , 그거에 맞는 케이스를 쓴다

    }


    @Test
    @DisplayName("스프링 컨테이너에 등록된 모든 빈들을 출력해야 한다 ")
    void findAllBeans() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        System.out.println("==============");
        System.out.println("전체 빈들 보기 ");
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }
        System.out.println("==============");

        System.out.println("==============");
        System.out.println(" 내가 만든 빈들만 보기  ");
        for (String beanName : beanDefinitionNames) {
            // 등록된 빈의 메타데이터 가져오기 // 데이터를 설명하는 데이터 = 메타데이터
            BeanDefinition bd = ac.getBeanDefinition(beanName);
            // ROLE_APPLICATION : 사용자가 직접 등록한 빈
            // ROLE_INFRASTRUCTURE : 스프링이 자체적으로 등록해서 사용하는 빈
            if (bd.getRole() == BeanDefinition.ROLE_APPLICATION) {
                System.out.println(beanName);
            }
        }
            System.out.println("==============");


    }

}
