/*Author: Yanga Jilaji
 * Student Number: 222582731
 * Due Date: 28 March 2025*/
package za.ac.cput.repository;

import za.ac.cput.domain.Artifact;

import java.util.List;

public interface IArtifactRepository extends IRepository<Artifact, String>{

    List<Artifact> getAll();
}
