package oop;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.info());
        
        Car childCar = new Car("red");
        System.out.println(childCar.info());

        Car mySCar = new Car("blue", "manual", 2);
        System.out.println(mySCar.info());

    }
}

class Car{
    String color;
    String gearType;
    int    door;
    Car(){
        this("white", "auto", 4);
    }
    Car(String color){
        this(color, "auto", 4);
        System.out.println("hi...");
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    public String info(){
        String temp = String.format(
            "color=%s, gearType=%s, door=%d",
            this.color, this.gearType, this.door
        );
        return temp;
    }

}