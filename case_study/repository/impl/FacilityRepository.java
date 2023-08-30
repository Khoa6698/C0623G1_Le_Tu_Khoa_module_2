package case_study.repository.impl;

import case_study.model.entity.facility.Facility;
import case_study.repository.IFacilityRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
 private static final Map<Facility,Integer> facilityIntegerMap = new HashMap<>();


    @Override
    public boolean delete(String id) {
        for (Map.Entry<Facility,Integer> m : facilityIntegerMap.entrySet()) {
            if (m.getKey().getId().equals(id)) {
                facilityIntegerMap.remove(m.getKey());
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Facility> displayMaintenanceFacility() {
        List<Facility> maintenanceList = new ArrayList<>();
        for (Map.Entry<Facility,Integer> m : facilityIntegerMap.entrySet()){
            if (m.getValue()>=5){
                maintenanceList.add(m.getKey());
            }
        }
        return maintenanceList;
    }

    @Override
    public void add(Facility facility) {
        facilityIntegerMap.put(facility,0);
    }

    @Override
    public List<Facility> getList() {
        List<Facility> facilityList = new ArrayList<>();
        for (Map.Entry<Facility,Integer> m : facilityIntegerMap.entrySet()){
            facilityList.add(m.getKey());
    }
        return facilityList;
    }
}
