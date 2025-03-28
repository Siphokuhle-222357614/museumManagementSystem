/*Author: Yanga Jilaji
* Due Date: 28 March 2015*/
package za.ac.cput.factory;

import za.ac.cput.domain.Artifact;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class ArtifactFactory {

    public static Artifact createArtifact(String artifactId, String name, String description){
              if(Helper.isNullOrEmpty(artifactId) || Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(description))
                  return null;

              return new Artifact.Builder().setArtifactId(artifactId)
                      .setName(name)
                      .setCondition(description)
                      .build();
    }
    public static Artifact createArtifact(String artifactId, String name, String description, LocalDate dateOfOrigin, String condition){
        if(Helper.isNullOrEmpty(artifactId) || Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(description)
                || Helper.isNullOrEmpty(description))
            return null;

        return new Artifact.Builder().setArtifactId(artifactId)
                .setName(name)
                .setDescription(description)
                .setDateOfOrigin(dateOfOrigin)
                .setCondition(condition)
                .build();
    }

    public static Artifact createArtifact(String artifactId, String name, String description, LocalDate dateOfOrigin, String condition,
                                          String material, String location){
        if(Helper.isNullOrEmpty(artifactId) || Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(description)
            || Helper.isNullOrEmpty(condition)  ||  Helper.isNullOrEmpty(material) ||  Helper.isNullOrEmpty(location))
            return null;

        return new Artifact.Builder().setArtifactId(artifactId)
                .setName(name)
                .setDescription(description)
                .setDateOfOrigin(dateOfOrigin)
                .setCondition(condition)
                .setMaterial(material)
                .setLocation(location)
                .build();
    }

}



