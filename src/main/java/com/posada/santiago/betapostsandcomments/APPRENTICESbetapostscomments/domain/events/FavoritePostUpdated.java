package com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.domain.events;

import co.com.sofka.domain.generic.DomainEvent;

public class FavoritePostUpdated extends DomainEvent {

    private Boolean favorite;


    public FavoritePostUpdated(Boolean favorite) {
        super("posada.santiago.PostFavoriteUpdated");
        this.favorite = favorite;
    }

    public Boolean getFavorite() {
        return favorite;
    }
}
