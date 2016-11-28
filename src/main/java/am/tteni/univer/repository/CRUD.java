package am.tteni.univer.repository;

/**
 * Created by Narek on 09.11.2016.
 */
public interface CRUD<T> {
    T create(T obj);
    T read(T obj);
    T update(T obj);
    void delete(T obj);
}
