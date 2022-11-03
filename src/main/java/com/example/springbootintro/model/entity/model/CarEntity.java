package com.example.springbootintro.model.entity.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    private String color;

    @Column(name = "person_id")
    private Long personId;

    @Transient
    private PersonEntity person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarEntity)) return false;

        CarEntity carEntity = (CarEntity) o;

        if (getId() != null ? !getId().equals(carEntity.getId()) : carEntity.getId() != null) return false;
        if (getModel() != null ? !getModel().equals(carEntity.getModel()) : carEntity.getModel() != null) return false;
        if (getColor() != null ? !getColor().equals(carEntity.getColor()) : carEntity.getColor() != null) return false;
        return getPerson() != null ? getPerson().equals(carEntity.getPerson()) : carEntity.getPerson() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (getPerson() != null ? getPerson().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", personId=" + personId +
                '}';
    }
}
