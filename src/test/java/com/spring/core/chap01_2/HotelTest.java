package com.spring.core.chap01_2;

import com.spring.core.chap01_2.config.HotelManger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HotelTest {

    @Test
    void objectTest(){

        // Hotel hotel = new Hotel(new EasternRestaurant(new JuanChef(),new SushiCourse()),new JuanChef())/
        // hotel.inform();

        HotelManger hm = new HotelManger();
        Hotel hotel = hm.hotel();
        hotel.inform();
    }


}
