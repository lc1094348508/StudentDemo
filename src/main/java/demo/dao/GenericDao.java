package demo.dao;

import java.util.List;

/**
 * Created by Administrator on 2016/5/23.
 */
public interface GenericDao<M> {
    void create(M model);
    void remove(int id);
    void update(M model);

    List<M> list();

    M search(String statement, Object pararmeter);

    M search(int id);
    List<M> list(String statement, Object parameter);
}
