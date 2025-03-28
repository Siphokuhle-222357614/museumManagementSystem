package za.ac.cput.factory;

import za.ac.cput.domain.exhibition;

public class exhibitionFactory {

    public static exhibition createexhibition(String title, String description) {
        if (title.isEmpty() || title == null) {
            return null;
        }
        if (description.isEmpty() || description == null) {
            return null;
        }
return new exhibition.Builder().title(title).description(description).build();
    }
}