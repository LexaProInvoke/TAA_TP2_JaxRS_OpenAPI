package fr.istic.taa.jaxrs.dao.generic;


import fr.istic.taa.jaxrs.domain.Rdv;


public class RdvDao extends AbstractJpaDao<Long, Rdv> {

    public RdvDao() {
        super(Rdv.class);
    }
}
