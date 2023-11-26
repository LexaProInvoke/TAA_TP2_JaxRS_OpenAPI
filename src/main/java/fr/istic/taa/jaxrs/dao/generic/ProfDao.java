package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.Prof;


public class ProfDao extends AbstractJpaDao<Long, Prof> {

    public ProfDao() {
        super(Prof.class);
    }
}
