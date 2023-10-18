package com.vladmihalcea.hpjp.hibernate.batch.identity;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.factory.spi.StandardGenerator;

/**
 * @author Vlad Mihalcea
 */
public class NoIdentityGenerator implements StandardGenerator {

    @Override
    public Object generate(SharedSessionContractImplementor session, Object obj) {
        return null;
    }
}
