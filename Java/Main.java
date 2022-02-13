package Java;

class Main {

    public static void main(String[] args) {
        Car car = new Car("AMQ123",new Account("Andres Herrera","AND123"));
        car.license = "AMQ123";
        car.passegenger = 4;

        Car car2 = new Car("MOB-01",new Account("Fercho Saavedra","MOB-01"));
        car2.passegenger = 2;
        car.printDataCar();
        car2.printDataCar();
    }

}