package com.spring.core.chap01_2;

public class Hotel {


//    private EasternRestaurant Raestaurant;
//    private KimChef headChef;

    private Restaurant restaurant;
    private Chef headChef;


    // 의존성 주입
    public Hotel(Restaurant restaurant ,Chef headChef){
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

    public void inform(){
        System.out.printf("우리 호텔의 레스토랑은 %s이며, 헤드쉐프는 %s입니다.\n"
                , restaurant.getClass().getSimpleName(), headChef.getClass().getSimpleName());
        // restaurant.getClass().getSimpleName(), headChef.getClass().getSimpleName()
            //getClass()
            //getSimpleName()
        restaurant.reserve();
    }

}
