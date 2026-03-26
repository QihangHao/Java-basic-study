package com.oop.ExtendsTest006;

/**
 * @author 郝启航
 */
public class manager extends Person {
    private double managementBonus;

    public manager(double managementBonus) {
        this.managementBonus = managementBonus;
    }

    public manager(String name, int id, double price, double managementBonus) {
        super(name, id, price);
        this.managementBonus = managementBonus;
    }

    public manager() {
    }

    public double getManagementBonus() {
        return managementBonus;
    }

    public void setManagementBonus(double managementBonus) {
        this.managementBonus = managementBonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工");
    }
}
