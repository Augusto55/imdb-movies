package com.api.crud_imdb.service;

import com.api.crud_imdb.domains.MovieService;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class CustomIdGenerator implements IdentifierGenerator {

    private MovieService movieService;
    private String prefix = "tt";

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        if (movieService == null) {
            movieService = ApplicationContextProvider.getBean(MovieService.class);
        }

        String id = movieService.getLastId();
        String newString = id.replace("tt", "");
        Integer newId = Integer.parseInt(newString) + 1;

        return prefix + newId;
    }
}
