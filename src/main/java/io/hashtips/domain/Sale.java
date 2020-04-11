package io.hashtips.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Sale {
    @EmbeddedId
    private SaleId saleId = new SaleId();
    @ManyToOne
    @MapsId("customerId")
    @JoinColumn(name = "customer_id")
    @JsonIgnore
    private Customer customer;
    @ManyToOne
    @MapsId("vehicleId")
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
    private int discount;

    public SaleId getSaleId() {
        return saleId;
    }

    public void setSaleId(SaleId saleId) {
        this.saleId = saleId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
