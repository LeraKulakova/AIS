
package dao;

import java.util.List;

public interface DAO<T> {

    Integer create(T entity);

    T read(Integer Id);

    List<T> readAll();

    void update(T entity);

    void delite(T entity);
}
