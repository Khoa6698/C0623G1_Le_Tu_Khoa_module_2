package case_study.controller;

import case_study.model.entity.facility.Facility;
import case_study.sevice.IFacilityService;
import case_study.sevice.impl.FacilityService;

import java.util.List;

public class FacilityController {
    private static final IFacilityService facilityService = new FacilityService();

    public List<Facility> displayMaintenanceFacility() {
       return facilityService.displayMaintenanceFacility();
    }

    public void add(Facility facility){
        facilityService.add(facility);
    }

    public boolean delete(String id){
       return facilityService.delete(id);
    }

    public List<Facility> getList(){
        return facilityService.getList();
    }

}
