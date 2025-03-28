/*Author: Yanga Jilaji
* Student Number: 222582731
* Due Date: 28 March 2025*/

package za.ac.cput.repository;

import za.ac.cput.domain.Artifact;

public interface IRepository<T, PK>{

    T create(T  c);

    T read(PK  pk);

    T update(T   t);

    boolean delete(PK  pk);

}
