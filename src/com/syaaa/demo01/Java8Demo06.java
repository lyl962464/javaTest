package com.syaaa.demo01;

/**
 * @ClassName Java8Demo06
 * @Description TODO
 * @Author APPO
 * @Date 16:01   2018-8-14
 * @Version 1.0
 **/
public class Java8Demo06 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }


}
interface Vehicle {
    default void print(){
        System.out.println("I am a vehicle!");
    }
    static void blowHorn(){
        System.out.println("Blowing horn!!!");
    }
}

interface FourWheeler {
    default void print(){
        System.out.println("I am a four wheeler!");
    }
}

class Car implements Vehicle, FourWheeler {
    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
}