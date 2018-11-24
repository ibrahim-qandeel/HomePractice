package com.home.work.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the ACTOR database table.
 */
@Entity
@Table(name = "ACTOR")
public class ActorEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ACTOR_ID")
    private long actorId;

    @Column(name = "FIRST_NAME")
    private String actorFirstName;

    public long getActorId() {
        return actorId;
    }

    public void setActorId(long actorId) {
        this.actorId = actorId;
    }

    public String getActorFirstName() {
        return actorFirstName;
    }

    public void setActorFirstName(String actorFirstName) {
        this.actorFirstName = actorFirstName;
    }
}