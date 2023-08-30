package case_study.sevice;

import case_study.model.entity.facility.Facility;

import java.util.List;

public interface IFacilityService extends IService<Facility> {
    boolean delete(String id);

    List<Facility> displayMaintenanceFacility();

    void add(Facility facility);

    List<Facility> getList();

}
