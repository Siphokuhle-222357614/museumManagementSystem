/*Author: Yanga Jilaji
 * Student Number: 222582731
 * Due Date: 28 March 2025*/
package za.ac.cput.repository;

import za.ac.cput.domain.Artifact;


import java.util.ArrayList;
import java.util.List;

public class ArtifactRepository implements IArtifactRepository{

    private static IArtifactRepository repo = null;
    private  List<Artifact> artifactsList;

    private ArtifactRepository(){
        artifactsList = new ArrayList<>();
    }

    public static IArtifactRepository getRepo(){
        if (repo == null){
            repo = new ArtifactRepository();
        }
        return repo;
    }
    
    @Override
    public Artifact create(Artifact art) {
        boolean success = artifactsList.add(art);
        if (success){
            return art;
        }
        return null;

    }

    @Override
    public Artifact read(String artId) {
        for(Artifact art: artifactsList){
            if (art.getArtifactId().equals(artId))
                return art;
        }
        return null;
    }

    @Override
    public Artifact update(Artifact artifact) {
        String artId = artifact.getArtifactId();
        Artifact artifact1 = read(artId);
        if (artifact1 == null)
            return null;
        boolean success = delete(artId);
        if(success){
            if (artifactsList.add(artifact))
                return artifact;
        }
        return null;
    }

    @Override
    public boolean delete(String artId) {
       Artifact artifactToDelete = read(artId);
       if (artifactToDelete == null)
           return false;
       return (artifactsList.remove(artifactToDelete));
    }
    @Override
    public List<Artifact> getAll() {
        return artifactsList;
    }
}
