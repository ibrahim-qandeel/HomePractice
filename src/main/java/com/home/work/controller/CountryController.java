package com.home.work.controller;

import com.home.work.ejb.ActorSessionBean;
import com.home.work.ejb.CountrySessionBean;
import com.home.work.jpa.ActorEntity;
import com.home.work.jpa.CountryEntity;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class CountryController implements
        Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private CountrySessionBean countrySessionBean;

    private CountryEntity currentCountry = new CountryEntity();

    @PostConstruct
    public void init() {
    }

    public void findCountry() {
        currentCountry = countrySessionBean.find(currentCountry.getCountryId());
//        System.out.println(currentCountry.getCities().get(0).getCity());
    }

    public CountryEntity getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(CountryEntity currentCountry) {
        this.currentCountry = currentCountry;
    }
}
