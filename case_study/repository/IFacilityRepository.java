package case_study.repository;

import case_study.model.entity.facility.Facility;

import java.util.List;

public interface IFacilityRepository extends IRepository<Facility> {
    boolean delete(String id);

    List<Facility> displayMaintenanceFacility();

}
