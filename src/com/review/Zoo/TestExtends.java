package com.review.Zoo;

/**
 * @author 郝启航
 */
public class TestExtends {
    public static void main(String[] args) {
        cat c1 =new cat("汤姆",3);
        Dog d1 =new Dog("斯派克",5);
        c1.eat();
        c1.catchMouse();
        d1.eat();
        d1.lookHome();
        AnimalHospital.treat(c1);
        AnimalHospital.treat(d1);

    }
}
