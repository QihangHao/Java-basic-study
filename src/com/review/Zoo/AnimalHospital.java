package com.review.Zoo;

/**
 * @author 郝启航
 */
public class AnimalHospital {
    public static void treat(Animal animal){
        System.out.println("正在治愈");
        animal.eat();
        if(animal instanceof cat){
            cat c1 =(cat)animal;
            c1.catchMouse();
        }
        else if(animal instanceof Dog){
            Dog d1 =(Dog) animal;
            d1.lookHome();
        }
    }
}
