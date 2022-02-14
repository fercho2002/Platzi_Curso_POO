class UberX extends Car {

    constructor(license,driver,brand,model){
        super(license,driver)
        this.brand = brand;
        this.brandmodel = model;
    }

    printDatacar() {
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
        }
}