package com.lcm.kong;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/1 下午1:40
 * Desc:
 * *****************************************************************
 */
public class MonkeyKing implements Cloneable {

    private int height;

    private int weight;

    private int age;

    private GoldHoopStick goldHoopStick;

    public MonkeyKing(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        goldHoopStick = new GoldHoopStick();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GoldHoopStick getGoldHoopStick() {
        return goldHoopStick;
    }

    @Override
    protected Object clone() {
        MonkeyKing monkeyKing = null;
        try {
            monkeyKing = (MonkeyKing) super.clone();
            return monkeyKing;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return monkeyKing;
        }
    }
}
