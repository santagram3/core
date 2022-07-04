package com.spring.core.chap01_1;

public class WesternRestaurant implements Restaurant{

    private Chef chef;
    private Course course;

    public WesternRestaurant(){
        this.chef = new JuanChef();
        this.course = new FranchCourse();
    }

    @Override
    public void reserve() {
        course.combineMenu();
    }

    @Override
    public void order() {
        chef.cook();
    }
}
