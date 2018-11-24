package com.home.work.ejb;

import com.home.work.jpa.ActorEntity;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class ActorSessionBean {

    @PersistenceContext(unitName = "JPAPracticeDS")
    private EntityManager em;

    public ActorEntity find(Long id) {
        return em.find(ActorEntity.class, id);
    }
}
