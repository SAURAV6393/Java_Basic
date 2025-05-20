class Vehicle {    
    int tyreSize;
    int cost;
    int engineSize;
}

class Bike extends Vehicle {
    int handleSize;
}

class Car extends Vehicle {
    int steeringSize;
}

public class Main {
    public static void main(String[] args) {
        Bike honda = new Bike();
        honda.handleSize = 4;
        honda.cost = 45000;
        honda.engineSize = 40;
        honda.tyreSize = 5;

        System.out.println(honda.handleSize);
        System.out.println(honda.cost);
        System.out.println(honda.engineSize);
        System.out.println(honda.tyreSize);
    }
}
