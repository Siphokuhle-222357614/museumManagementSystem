package za.ac.cput;

import za.ac.cput.domain.Visitor;
import za.ac.cput.factory.visitorFactory;

import java.time.LocalDate;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            // Creating a valid visitor
            Visitor visitor = visitorFactory.createVisitor(1, "John", "Doe", "123-456-7890");

            // Displaying visitor details
            System.out.println("Visitor Created Successfully:");
            System.out.println(visitor);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Attempt to create a visitor with invalid email
        try {
            Visitor invalidVisitor = visitorFactory.createVisitor(2, "Jane", "Doe", "9876543210");
            System.out.println(invalidVisitor);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}