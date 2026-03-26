package com.oop.PolymorphicTest001;

/**
 * @author 郝启航
 */
public class StudentManagementSystem {
    public static void register(Person person){
        System.out.println("姓名为"+person.getName()+"的同学"+"注册成功"+"账号为："+person.getAccount()+"密码为："+person.getPassWord());
    }
}
