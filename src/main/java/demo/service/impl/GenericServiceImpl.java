package demo.service.impl;

import demo.dao.GenericDao;
import demo.service.GenericService;

import java.util.List;

/**
 * Created by Administrator on 2016/5/24.
 */
public abstract class GenericServiceImpl<M> implements GenericService<M>{

    GenericDao<M> genericDao;
    abstract void setGenericDao(GenericDao<M> genericDao);


    @Override
    public void create(M model) {
        genericDao.create(model);
    }

    @Override
    public void remove(int id) {
        genericDao.remove(id);
    }

    @Override
    public void update(M model) {
        genericDao.update(model);
    }

    @Override
    public List<M> list() {
        return genericDao.list();
    }

    @Override
    public M search(int id) {
        return genericDao.search(id);
    }

    @Override
    public List<M> list(String statement, Object parameter) {
        return genericDao.list(statement,parameter);
    }

    @Override
    public M search(String statement, Object parameter) {
        return genericDao.search(statement,parameter);
    }
}
