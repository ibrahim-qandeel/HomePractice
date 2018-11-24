package com.home.work.ejb;

import com.home.work.jpa.CityEntity;
import com.home.work.jpa.CountryEntity;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
@LocalBean
public class CitySessionBean {

    @PersistenceContext(unitName = "JPAPracticeDS")
    private EntityManager em;

    public CityEntity find(Long id) {
//        TypedQuery query = em.createQuery("SELECT c FROM CityEntity c WHERE c.cityId=:id", CityEntity.class);
        TypedQuery query = em.createQuery("SELECT c FROM CityEntity c WHERE c.city like '%ca%'", CityEntity.class);
        CityEntity city = (CityEntity) query.getResultList().get(0);
        System.out.println(city.getCountry().getCountery());
        System.out.println(city.getCountry().getCountery());
//        query.setParameter("id", id);
//        query.setHint("eclipselink.join-fetch", "c.country");
        return city;
    }
}
