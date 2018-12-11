package com.home.work.controller;

import com.home.work.ejb.CitySessionBean;
import com.home.work.ejb.CountrySessionBean;
import com.home.work.jpa.CityEntity;
import com.home.work.jpa.CountryEntity;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class CityController implements
        Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private CitySessionBean citySessionBean;

    private CityEntity currentCity = new CityEntity();

    @PostConstruct
    public void init() {
    }

    public void findCity() {
        currentCity = citySessionBean.find(currentCity.getCityId());
    }

    public void action(){
        System.out.println("Action Method ...");
    }

    public void actionListener(){
        System.out.println("Action Listener Method ...");
    }

    public CityEntity getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(CityEntity currentCity) {
        this.currentCity = currentCity;
    }
}
