/*Siphokuhle Gedze
* 222357614
* 28 March 2025*/
package za.ac.cput.repository;

public interface IRepository {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
