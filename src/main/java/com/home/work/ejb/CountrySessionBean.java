package com.home.work.ejb;

import com.home.work.jpa.ActorEntity;
import com.home.work.jpa.CountryEntity;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class CountrySessionBean {

    @PersistenceContext(unitName = "JPAPracticeDS")
    private EntityManager em;

    public CountryEntity find(Long id) {
        return em.find(CountryEntity.class, id);
    }
}
