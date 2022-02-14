package Java;
class UberX extends Car{
    String brand;
    String model;

    public UberX(String license,Account driver,String brand,String model){
        super(license,driver);
        this.brand = brand;
        this.model = model;
    }
    void printDataCar(){
        if(getPassengenger()>=4){
            System.out.println("-- License: "+license +"  -- Driver: "+driver.name+"  -- numero de pasajeros : "+getPassengenger());
        }
    }
}