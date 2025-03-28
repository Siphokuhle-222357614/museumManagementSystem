/*Author: Yanga Jilaji
Student Number: 222582731
* Due Date: 28 March 2025*/
package za.ac.cput.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Artifact;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ArtifactFactoryTest {

    private Artifact art1 = ArtifactFactory.createArtifact("75976",
            "The Rosetta Stone", "Good");

    private Artifact art2 = ArtifactFactory.createArtifact("", "Bone Tools",
            "Earliest known examples of human made tools.");

    private Artifact art3 = ArtifactFactory.createArtifact("39720", "Ochre Pieces",
            "Made primarily from iron-rich clay.", "Very Good condition");


    @Test
    @Order(1)
    public void testCreateArtifact(){
    assertNotNull(art1);
    System.out.println(art1.toString());
}

@Test
@Order(2)
public void testCreateArtifactWithNameAndDescription(){
assertNotNull(art2);
    System.out.println(art2.toString());

}
@Test
@Order(3)
public void testUpdateArtifactId(){
    assertNotNull(art3);
    System.out.println(art3.toString());


}
}