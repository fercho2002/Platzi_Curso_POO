package Java;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String,Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license,Account driver){
        super(license,driver);
        }
}
