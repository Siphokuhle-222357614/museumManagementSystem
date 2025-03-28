/*Author: Yanga Jilaji
* Due Date: 28 March 2025*/
package za.ac.cput.domain;

import java.time.LocalDate;

public class Artifact {

    private String artifactId;
    private String name;
    private String description;
    private LocalDate dateOfOrigin;
    private String condition;
    private String material;
    private String location;


    public Artifact(){

    }
    private Artifact(Builder builder) {
        this.artifactId= builder.artifactId;
        this.name= builder.name;
        this.description= builder.description;
        this.dateOfOrigin= builder.dateOfOrigin;
        this.condition= builder.condition;
        this.material= builder.material;
        this.location= builder.location;


    }

    public String getArtifactId() {
        return artifactId;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public LocalDate getDateOfOrigin() {
        return dateOfOrigin;
    }
    public String getCondition() {
        return condition;
    }
    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "artifactId=" + artifactId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dateOfOrigin=" + dateOfOrigin +
                ", condition='" + condition + '\'' +
                ", material='" + material + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    //Builder Class
    public static class Builder {
        private String artifactId;
        private String name;
        private String description;
        private LocalDate dateOfOrigin;
        private String condition;
        private String material;
        private String location;

        public Builder setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }
        public Builder setDateOfOrigin(LocalDate dateOfOrigin) {
            this.dateOfOrigin = dateOfOrigin;
            return this;
        }
        public Builder setCondition(String condition){
            this.condition=  condition;
            return this;
        }
        public Builder setMaterial(String material) {
            this.material = material;
            return this;
        }
        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Artifact.Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public Artifact.Builder name(String name) {
            this.name = name;
            return this;
        }
        public Artifact.Builder description(String description){
            this.description = description;
            return this;
        }
        public Artifact.Builder dateOfOrigin(LocalDate dateOfOrigin) {
            this.dateOfOrigin = dateOfOrigin;
            return this;
        }
        public Artifact.Builder condition(String condition) {
            this.condition = condition;
            return this;
        }
        public Artifact.Builder material(String material) {
            this.material = material;
            return this;
        }
        public Artifact.Builder location(String location) {
            this.location = location;
            return this;
        }

        //copy of role
        public Builder copy(Artifact art){
            this.artifactId= art.artifactId;
            this.name= art.name;
            this.description= description;
            this.dateOfOrigin= art.dateOfOrigin;
            this.condition= art.condition;
            this.material= art.material;
            this.location= art.location;
            return this;

        }



        public Artifact build() {
            return new Artifact(this);
        }
    }//end of Builder class
}//end of Artifact class

