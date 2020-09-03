package com.sphinxcodes;

public class Main {

    public static void main(String[] args) {
        Vehicle ride = new Vehicle();
        System.out.println(ride.getColor());
        ride.setColor("red");
        System.out.println(ride.getName());
        System.out.println(ride.count);

        Vehicle benz = new Vehicle("benz "," green ","89 ", " sphinx","1200");
        System.out.println(benz.getCompany());
        System.out.println(ride.getColor());
        System.out.println(benz.getSpeed());
        System.out.println(ride.count);
        System.out.println(benz.count);



    }
}
