package demo.service;

import java.util.List;

/**
 * Created by Administrator on 2016/5/24.
 */
public interface GenericService<M> {
    void create(M model);
    void remove(int id);
    void update(M model);

    List<M> list();

    M search(int id);

    M search(String statement, Object parameter);

    List<M> list(String statement, Object parameter);

}
