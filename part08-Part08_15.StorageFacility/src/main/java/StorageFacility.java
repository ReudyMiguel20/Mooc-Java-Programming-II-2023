
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnitMap;

    public StorageFacility() {
        this.storageUnitMap = new HashMap<>();
    }

    public void add(String unit, String item) {
        //If the key already exist, dont create a new ArrayList.
        if (storageUnitMap.containsKey(unit)) {
            ArrayList<String> itemList = this.storageUnitMap.get(unit);
            itemList.add(item);
        } else if (!(storageUnitMap.containsKey(unit))) {
            /* If the key doesnt exist, create a new ArrayList, add the value, then
        methods ends*/
            storageUnitMap.put(unit, new ArrayList<>());
            ArrayList<String> itemList = this.storageUnitMap.get(unit);
            itemList.add(item);
        }

    }

    public ArrayList<String> contents(String storageUnit) {
        //If the storageUnit given in the parameter doesnt exist, return an empty list.
        if (!(storageUnitMap.containsKey(storageUnit))) {
            ArrayList emptyList = new ArrayList<>();
            return emptyList;
        }

        //If the storageUnit given as a parameter exist, then return the values.
        return storageUnitMap.get(storageUnit);

    }

    public void remove(String storageUnit, String item) {
        /* removes the given item from the given storage unit. NB! Only removes one item - If
        theres several items with the same name, the rest still remain. If the storage unit would be
        empty after the removal, the method also removes the unit.*/

        //If the storageUnit is empty after removing the item, then it removes the Unit too.
        if (this.storageUnitMap.get(storageUnit).size() == 1) {
            this.storageUnitMap.get(storageUnit).remove(item);
            this.storageUnitMap.remove(storageUnit);
        } else if (this.storageUnitMap.get(storageUnit).size() > 1) {
            //If theres several items with the same name, the rest still remain.
            this.storageUnitMap.get(storageUnit).remove(item);
        }

        //Removes only one item...
    }

    public ArrayList<String> storageUnits() {
        //Returns the names of the storage units as a list. NB! Only the units that contain items are listed.
        ArrayList<String> storageUnitList = new ArrayList<>();

        for (String storageUnits : storageUnitMap.keySet()) {
            if (!(storageUnits.isEmpty())) {
                storageUnitList.add(storageUnits);
            }
        }
        
        return storageUnitList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.storageUnitMap);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StorageFacility other = (StorageFacility) obj;
        if (!Objects.equals(this.storageUnitMap, other.storageUnitMap)) {
            return false;
        }
        return true;
    }

}
