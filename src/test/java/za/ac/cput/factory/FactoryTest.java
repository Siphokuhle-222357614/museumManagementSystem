package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.TestDescriptor;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    public void testVisitorCreation() {
        LocalDate hireDate = LocalDate.of(2024, 3, 28);
        TestDescriptor.Visitor visitor = VisitorFactory.createVisitor(2, "Jane", "Smith", "jane.smith@example.com", "0987654321", hireDate, 3);

        assertNotNull(visitor);
        assertEquals(2, visitor.getVisitorId());
        assertEquals("Jane", visitor.getVisitorFirstName());
        assertEquals("Smith", visitor.getVisitorLastName());
        assertEquals("jane.smith@example.com", visitor.getVisitorEmail());
        assertEquals("0987654321", visitor.getVisitorPhoneNumber());
        assertEquals(hireDate, visitor.getHireTime());
        assertEquals(3, visitor.getTicketPurchased());
    }

    @Test
    public void testFormatVisitorInfo() {
        Visitor visitor = new Visitor.Builder()
                .visitorId(3)
                .visitorFirstName("Alice")
                .visitorLastName("Brown")
                .visitorEmail("alice.brown@example.com")
                .visitorPhoneNumber("1112223333")
                .ticketPurchased(5)
                .build();

        String expected = "Visitor ID: 3, Name: Alice Brown, Email: alice.brown@example.com, Phone: 1112223333, Tickets: 5";
        assertEquals(expected, VisitorUtil.formatVisitorInfo(visitor));
    }
}