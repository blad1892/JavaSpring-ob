package com.example.JavaSpringob;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacture;
    private String model;
    private Long year;

    public Coche() {
    }

    public Coche(Long id, String manufacture, String model, Long year) {
        this.id = id;
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
