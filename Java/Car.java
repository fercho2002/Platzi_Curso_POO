package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passegenger = 0;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    public Integer getPassengenger(){
        return passegenger;
    }
    public void setPassengenger(Integer passengenger){
        if(passengenger >= 4){
            this.passegenger = passengenger;
        }
        else{
            System.out.println("minimo deben ser 4 pasajeros ");
        }
    }


     void printDataCar(){
         System.out.println("License: "+license +"Driver: "+driver.name+"  -- numero de pasajeros : "+passegenger);
     }
}
