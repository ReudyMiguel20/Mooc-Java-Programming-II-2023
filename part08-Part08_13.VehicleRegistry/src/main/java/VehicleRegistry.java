import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> car;

    public VehicleRegistry() {
        this.car = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        /* assigns the owner it received as a parameter to a car that corresponds to the license plate 
        received as a parameter. If the license plate doesn't have an owner, the method returns true. 
        If the license already has an owner attached, the method returns false and does nothing.*/
        if (!(car.containsKey(licensePlate))) {
            car.put(licensePlate, owner);
            return true;
        }
        if (car.containsKey(licensePlate) && car.values().isEmpty()){
            car.put(licensePlate, owner);
            return true;
        }
//        if (car.containsKey(licensePlate) && car.values().contains(owner)){
//            return true;
//        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        /* returns the owner of the car corresponding to the license plate received 
        as a parameter. If the car isn't in the registry, the method returns null. */
        for (LicensePlate i : car.keySet()){
            if (car.containsKey(licensePlate)){
                return car.get(licensePlate);
            }
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        /* removes the license plate and attached data from the registry. The method
        returns true if removes successfully and false if the license plate wasn't in the registry.*/
        for (LicensePlate i : car.keySet()){
            if (car.containsKey(licensePlate)){
                car.remove(licensePlate);
                return true;
            }
        }
        return false;
    }
    
    public void printLicensePlates(){
        /* prints the license plates in the registry. */
        for (LicensePlate i : car.keySet()){
            System.out.println(i.getCountry() + ", " +  i.getLiNumber());
        }
    }
    
    public void printOwners(){
        /* prints the owner of the cars in the registry. Each name should only
        be printed once, even if a particular person owns more than one car. */
        ArrayList<String> owners = new ArrayList<>();
                
        for (String ownersCar : car.values()){
            if ((!(owners.contains(ownersCar)))){
                owners.add(ownersCar);
            }
        }
        
        for (String ownersCar : owners){
            System.out.println(ownersCar);
        }
 
    }
}
