/*Author: Yanga Jilaji
Student Number: 222582731
* Due Date: 28 March 2025*/
package za.ac.cput.factory;

import za.ac.cput.domain.Artifact;
import za.ac.cput.util.ArtifactHelper;

public class ArtifactFactory {

    public static Artifact createArtifact(String artifactId, String name, String description){
        //ArtifactHelper Helper;
        if(ArtifactHelper.isNullOrEmpty(artifactId) || ArtifactHelper.isNullOrEmpty(name) || ArtifactHelper.isNullOrEmpty(description))
                  return null;

              return new Artifact.Builder().setArtifactId(artifactId)
                      .setName(name)
                      .setCondition(description)
                      .build();
    }


    public static Artifact createArtifact(String artifactId, String name, String description, String condition){
        if(ArtifactHelper.isNullOrEmpty(artifactId) || ArtifactHelper.isNullOrEmpty(name) || ArtifactHelper.isNullOrEmpty(description)
                || ArtifactHelper.isNullOrEmpty(description))
            return null;

        return new Artifact.Builder().setArtifactId(artifactId)
                .setName(name)
                .setDescription(description)
                .setCondition(condition)
                .build();
    }
    public static Artifact createArtifact(String artifactId, String name, String description, String condition,
                                          String material, String location){
        if(ArtifactHelper.isNullOrEmpty(artifactId) || ArtifactHelper.isNullOrEmpty(name) || ArtifactHelper.isNullOrEmpty(description)
                || ArtifactHelper.isNullOrEmpty(condition)  ||  ArtifactHelper.isNullOrEmpty(material) ||  ArtifactHelper.isNullOrEmpty(location))
            return null;

        return new Artifact.Builder().setArtifactId(artifactId)
                .setName(name)
                .setDescription(description)
                .setCondition(condition)
                .setMaterial(material)
                .setLocation(location)
                .build();
    }


}



