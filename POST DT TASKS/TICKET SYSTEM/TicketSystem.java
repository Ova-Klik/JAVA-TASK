import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TicketSystem {
    private List<User> registeredUsers = new ArrayList<>();
    private User currentUser = null;

    // Register Account Operation
    public void register(String name, String email, String password) {
        for (User user : registeredUsers) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Registration Failed: Email already exists.");
                return;
            }
        }
        registeredUsers.add(new User(name, email, password));
        System.out.println("Account registered successfully for " + name);
    }

    // Login Operation
    public boolean login(String email, String password) {
        for (User user : registeredUsers) {
            if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Login Successful! Welcome, " + user.getName());
                return true;
            }
        }
        System.out.println("Login Failed: Invalid email or password.");
        return false;
    }

    public void logout() {
        currentUser = null;
        System.out.println("Logged out successfully.");
    }

    public void buyTicket(User creator, Event event, int quantity) {
        if (currentUser == null) {
            System.out.println("Operation Failed: You must be logged in to buy tickets.");
            return;
        }

        double totalCost = event.getPrice() * quantity;

        if (event.purchaseTickets(quantity)) {
            if (currentUser.getWallet().getBalance() >= totalCost) {
                currentUser.getWallet().withdraw(totalCost);
                creator.getWallet().deposit(totalCost);
                System.out.println("Purchase Confirmed! Ticket ID: " + UUID.randomUUID().toString().substring(0, 5));
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Tickets sold out.");
        }
    }
}
