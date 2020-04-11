package io.hashtips.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SaleId implements Serializable {
    private Long customerId;
    private Long vehicleId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleId)) return false;
        SaleId saleId = (SaleId) o;
        return Objects.equals(getCustomerId(), saleId.getCustomerId()) &&
                Objects.equals(getVehicleId(), saleId.getVehicleId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCustomerId(), getVehicleId());
    }
}
