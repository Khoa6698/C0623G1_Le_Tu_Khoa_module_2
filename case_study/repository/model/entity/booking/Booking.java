package case_study.model.entity.booking;

import case_study.model.entity.customer.Customer;
import case_study.model.entity.facility.Facility;

public class Booking {
    private String id;
    private String dayBooking;
    private String startDay;
    private String endDay;
    private Customer customerId;
    private Facility furamaServiceId;

    public Booking(String id, String dayBooking, String startDay,
                   String endDay, Customer customerId,
                   Facility furamaServiceId) {
        this.id = id;
        this.dayBooking = dayBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerId = customerId;
        this.furamaServiceId = furamaServiceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(String dayBooking) {
        this.dayBooking = dayBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Facility getFuramaServiceId() {
        return furamaServiceId;
    }

    public void setFuramaServiceId(Facility furamaServiceId) {
        this.furamaServiceId = furamaServiceId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", dayBooking='" + dayBooking + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerId=" + customerId +
                ", furamaServiceId=" + furamaServiceId +
                '}';
    }
}
