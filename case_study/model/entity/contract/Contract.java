package case_study.model.entity.contract;

import case_study.model.entity.booking.Booking;

public class Contract {
    private String contractNumber;
    private Booking bookingId;
    private double deposit;
    private double totalMoneyPay;

    public Contract(String contractNumber, Booking bookingId, double deposit, double totalMoneyPay) {
        this.contractNumber = contractNumber;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.totalMoneyPay = totalMoneyPay;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Booking getBookingId() {
        return bookingId;
    }

    public void setBookingId(Booking bookingId) {
        this.bookingId = bookingId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoneyPay() {
        return totalMoneyPay;
    }

    public void setTotalMoneyPay(double totalMoneyPay) {
        this.totalMoneyPay = totalMoneyPay;
    }

    @Override
    public String toString() {
        return "RentalContract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingId=" + bookingId +
                ", deposit=" + deposit +
                ", totalMoneyPay=" + totalMoneyPay +
                '}';
    }
}
