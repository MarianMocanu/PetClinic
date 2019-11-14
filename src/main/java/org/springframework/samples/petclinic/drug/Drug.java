package org.springframework.samples.petclinic.drug;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Table(name = "drugs")
public class Drug extends BaseEntity {

    @NotEmpty
    @Column(name = "name")
    private String name;

    @Column(name = "expiry_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate expiryDate;

    @Column(name = "pet_type_id")
    private Integer petTypeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getPetTypeId() {
        return petTypeId;
    }

    public void setPetTypeId(Integer petTypeId) {
        this.petTypeId = petTypeId;
    }
}


