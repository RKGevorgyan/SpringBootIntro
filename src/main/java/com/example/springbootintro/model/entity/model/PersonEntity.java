package com.example.springbootintro.model.entity.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
@NamedQueries({
        @NamedQuery(name = "PersonEntity.findAll",
                query = "select p from PersonEntity p"),
        @NamedQuery(name = "PersonEntity.findByName",
                query = "select p from PersonEntity p where p.name = :name")
})
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    @OneToOne
    @JoinColumn(name = "car_id")
    private CarEntity car;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonEntity)) return false;

        PersonEntity person = (PersonEntity) o;

        if (getId() != null ? !getId().equals(person.getId()) : person.getId() != null) return false;
        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        if (getAge() != null ? !getAge().equals(person.getAge()) : person.getAge() != null) return false;
        return getCar() != null ? getCar().equals(person.getCar()) : person.getCar() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        result = 31 * result + (getCar() != null ? getCar().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
