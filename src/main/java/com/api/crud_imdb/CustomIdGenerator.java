package com.api.crud_imdb;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class CustomIdGenerator implements IdentifierGenerator {
    @Autowired
    private MovieService movieService;
    String prefix = "tt";

    String id = movieService.getLastId();
    Integer newId = Integer.parseInt(id)+1;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

        return prefix + newId;
    }
}
