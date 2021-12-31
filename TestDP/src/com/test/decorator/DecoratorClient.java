package com.test.decorator;

interface Car{
    void assemble();

}
class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}

class CarDecorator implements Car{
    Car c;

    CarDecorator(Car c){
        this.c = c;
    }

    @Override
    public void assemble() {
        c.assemble();
    }
}
class Sedan extends CarDecorator{
    Sedan(Car c){
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Sedan car features ");
    }
}
class AddSpoiler extends CarDecorator{

    AddSpoiler(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Spoiler");
    }
}

class HatchBack extends CarDecorator{
    HatchBack(Car c){
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("HatchBack car features ");
    }
}

public class DecoratorClient {
    public static void main(String[] args) {
//        Car c = new Sedan(new BasicCar());
//        c.assemble();
//
//        Car c2 = new AddSpoiler(new Sedan(new BasicCar()));
//        c2.assemble();


        Car c3 = new AddSpoiler(new BasicCar());
        c3.assemble();


    }
}

