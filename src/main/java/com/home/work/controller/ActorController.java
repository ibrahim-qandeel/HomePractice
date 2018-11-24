package com.home.work.controller;

import com.home.work.ejb.ActorSessionBean;
import com.home.work.jpa.ActorEntity;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class ActorController implements
        Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ActorSessionBean actorSessionBean;

    private ActorEntity currentActor = new ActorEntity();

    @PostConstruct
    public void init() {
    }

    public void findActor() {
        currentActor = actorSessionBean.find(currentActor.getActorId());
    }

    public ActorEntity getCurrentActor() {
        return currentActor;
    }

    public void setCurrentActor(ActorEntity currentActor) {
        this.currentActor = currentActor;
    }
}
