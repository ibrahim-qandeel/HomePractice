package com.home.work.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the COUNTRY database table.
 */
@Entity
@Table(name = "COUNTRY")
public class CountryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "COUNTRY_ID")
    private long countryId;

    @Column(name = "COUNTRY")
    private String countery;

//    @OneToMany(mappedBy = "country")
//    private List<CityEntity> cities;

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getCountery() {
        return countery;
    }

    public void setCountery(String countery) {
        this.countery = countery;
    }

//    public List<CityEntity> getCities() {
//        return cities;
//    }
//
//    public void setCities(List<CityEntity> cities) {
//        this.cities = cities;
//    }
}