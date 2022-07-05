package com.spring.core.chap02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HotelXmlTest {

    // 스프링 컨테이너 객체 생성
     GenericXmlApplicationContext ac
            = new GenericXmlApplicationContext("HotelConfig.xml");


    @Test
    @DisplayName("xml 설정 파일에 등록된 빈들을 조회해야 한다 ")
    void findBeanTest(){
        Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();
    }
}
