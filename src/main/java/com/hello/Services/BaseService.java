package com.hello.Services;

/**
 * Created by fatimam on 04/09/2017.
 */
public interface BaseService <E, ID> {
    E save(E entity);
    E findById(ID id);
    E update(E entity);
    void delete(ID id);
}
