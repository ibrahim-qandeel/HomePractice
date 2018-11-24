package com.home.work.jpa;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.Noncacheable;
import org.eclipse.persistence.config.CacheIsolationType;
import org.eclipse.persistence.config.CacheType;
import org.eclipse.persistence.config.QueryHints;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the CITY database table.
 */
@Entity
@Table(name = "CITY")
@Cacheable
//@NamedQuery(name = "batchCity", query = "Select c from CityEntity c where c.cityId > 5",
//        hints = {@QueryHint(name = "eclipselink.batch", value = "c.country")})
public class CityEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CITY_ID")
    private long cityId;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY_ID")
    private long counteryId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID", insertable = false, updatable = false)
    private CountryEntity country;

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getCounteryId() {
        return counteryId;
    }

    public void setCounteryId(long counteryId) {
        this.counteryId = counteryId;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }
}