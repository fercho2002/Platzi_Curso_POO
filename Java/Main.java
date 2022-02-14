package Java;

class Main {

    public static void main(String[] args) {
        
        UberX uberX = new UberX("licens100",new Account("fercho","100243838"),"kia","spark");
        uberX.setPassengenger(8);
        uberX.printDataCar();
        UberVan uberVan = new UberVan("zxc222",new Account("fercho","100243838"));
        uberVan.setPassengenger(6);
        uberVan.printDataCar();
        /*Car car = new Car("AMQ123",new Account("Andres Herrera","AND123"));
        car.license = "AMQ123";
        car.passegenger = 4;

        Car car2 = new Car("MOB-01",new Account("Fercho Saavedra","MOB-01"));
        car2.passegenger = 2;
        car.printDataCar();
        car2.printDataCar();*/
    }

}