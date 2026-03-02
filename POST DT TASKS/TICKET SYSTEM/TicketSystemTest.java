public class TicketSystemTest {
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();

        // 1. Account Operations: Register
        system.register("Semicolon Student", "student@semicolon.africa", "password123");

        // 2. Event Creator Setup
        User creator = new User("TechTribe Admin", "admin@techtribe.com", "adminPass");
        Event javaWorkshop = new Event("Java OOP", 50.0, 10, true);

        // 3. Login Flow
        System.out.println("\n--- Attempting Login ---");
        boolean isLogged = system.login("student@semicolon.africa", "wrongPass"); // Fails
        
        if (!isLogged) {
            isLogged = system.login("student@semicolon.africa", "password123"); // Succeeds
        }

        // 4. Ticket Flow (Only works if isLogged is true)
        if (isLogged) {
            // Setup wallet for the logged-in user (simulating Funding)
            // In a real app, you'd find the user object, here we use our test reference
            system.login("student@semicolon.africa", "password123"); // Ensure
            
 }
            
}
}
