package case_study.sevice.impl;

import case_study.model.entity.facility.Facility;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.FacilityRepository;
import case_study.sevice.IFacilityService;

import java.util.List;

public class FacilityService implements IFacilityService {
    private final IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public boolean delete(String id) {
        return facilityRepository.delete(id);
    }

    @Override
    public List<Facility> displayMaintenanceFacility() {
        return facilityRepository.displayMaintenanceFacility();
    }

    @Override
    public void add(Facility facility) {
        facilityRepository.add(facility);
    }

    @Override
    public List<Facility> getList() {
        return facilityRepository.getList();
    }
}
