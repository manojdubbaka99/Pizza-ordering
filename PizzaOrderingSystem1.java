import java.util.Scanner;

public class PizzaOrderingSystem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to Pizza Palace!");

        // Display available toppings
        System.out.println("Available Toppings:");
        System.out.println("1. Pepperoni");
        System.out.println("2. Mushrooms");
        System.out.println("3. Onions");
        System.out.println("4. Olives");
        // Add more toppings as needed

        // Get user's choice of toppings
        System.out.print("Enter topping numbers separated by commas (e.g., 1,2): ");
        String toppingsInput = scanner.nextLine();
        String[] selectedToppings = toppingsInput.split(",");

        // Display available sizes
        System.out.println("Available Sizes:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");

        // Get user's choice of size
        System.out.print("Enter size number: ");
        int sizeChoice = scanner.nextInt();

        // Calculate total cost based on toppings and size
        double totalPrice = calculateTotalPrice(selectedToppings.length, sizeChoice);

        // Display order summary
        System.out.println("\nOrder Summary:");
        System.out.println("Toppings:");
        for (String topping : selectedToppings) {
            System.out.println("- " + getToppingName(topping));
        }
        System.out.println("Size: " + getSizeName(sizeChoice));
        System.out.println("Total Price: $" + totalPrice);

        // Close scanner
        scanner.close();
    }

    // Method to calculate total price based on toppings and size
    private static double calculateTotalPrice(int numToppings, int sizeChoice) {
        double basePrice;
        switch (sizeChoice) {
            case 1:
                basePrice = 6.99; // Small
                break;
            case 2:
                basePrice = 8.99; // Medium
                break;
            case 3:
                basePrice = 10.99; // Large
                break;
            default:
                basePrice = 0.0; // Invalid choice
        }
        return basePrice + (numToppings * 1.50); // Additional cost per topping
    }

    // Method to get topping name based on topping number
    private static String getToppingName(String toppingNumber) {
        switch (toppingNumber.trim()) {
            case "1":
                return "Pepperoni";
            case "2":
                return "Mushrooms";
            case "3":
                return "Onions";
            case "4":
                return "Olives";
            default:
                return "Unknown Topping";
        }
    }

    // Method to get size name based on size number
    private static String getSizeName(int sizeChoice) {
        switch (sizeChoice) {
            case 1:
                return "Small";
            case 2:
                return "Medium";
            case 3:
                return "Large";
            default:
                return "Unknown Size";
        }
    }
}
