
/** Description: Managing the inventory of a shop named FLoral Bliss by implementing class Flower from Flower.java
 * Programmer: Zul Iskandar bin Zainorhan
 * 
 * Date: 20/2/2024
 */

// Uncomment to use i/o

//import javax.swing.JOptionPane; // using JOptionPane for I/O
import java.util.Scanner;       // using Scanner for I/O

public class FlowerShop {
    public static void main(String[] args) {
        // Placeholder variables
        String     name =   ""; // Flower Name
        String    color =   ""; // Flower Color
        double    price = 0.00; // Flower Price
        int    quantity =    0; // Flower Quantity

        // Creating I/O Object
        Scanner lineInput = new Scanner(System.in);

        // Creating an Object Array
        int    arraySize = 5;                         // Specify the number of flower types to be stored
        Flower[] flowers = new Flower[arraySize];

        // Input data to the array
        for (int i = 0; i < arraySize; i++) {

            // input flower name
            System.out.print("Enter Flower " + (i + 1) + "Name: ");
            name = lineInput.nextLine();

            // input flower color
            System.out.print("Enter Flower " + (i + 1) + "Color: ");
            color = lineInput.nextLine();

            // input flower price
            System.out.print("Enter Flower " + (i + 1) + "Price: ");
            price = lineInput.nextDouble();

            // input flower quantity
            System.out.print("Enter Flower " + (i + 1) + "Quantity: ");
            quantity = lineInput.nextInt();

            System.out.println(
                "\nStored:" +
                "\nFlower Name     : " + name     +
                "\nFlower Color    : " + color    +
                "\nFlower Price(RM): " + price    +
                "\nFlower Stock    : " + quantity +
                "\n"
            );
            
            flowers[i] = new Flower();
            flowers[i].updateFlower(name, color, price, quantity);

            lineInput.skip("\r\n|[\n\r\u2028\u2029\u0085]");
            
        }

        // Display all value of flowers
        for (Flower oneFlower: flowers) {
            System.out.println(
                "\n Value for Flower " + oneFlower.getName() + " Color " + oneFlower.getColor() + " is:" +
                "\n>>> " + oneFlower.calculateValue()
            );
        }

        // Search a flower
        boolean foundName = false;

        System.out.println("Search a flower with name:");
        String searchName = lineInput.nextLine();           // Input Search Name

        for (Flower searchFlower: flowers) {
            if (searchFlower.getName().equalsIgnoreCase(searchName)) {
                foundName = true;
                searchFlower.toString();
            };
        }

        if (!foundName) {
            System.out.println("Flower " + searchName + " is not available");
        }

        // Restock the quantity of flower available
        boolean found = false;

        int prevQtt, newQtt, resQtt; // Previous Quantity and New Quantity

        System.out.println("Restock flower with name:");
        searchName = lineInput.nextLine();           // Input Search Name

        for (Flower searchFlower: flowers) {
            if (searchFlower.getName().equalsIgnoreCase(searchName)) {
                found = true;
                
                System.out.println("Enter the ammount to restock:");
                resQtt  = lineInput.nextInt();
                prevQtt = searchFlower.getQuantity();
                newQtt  = prevQtt + resQtt;

                System.out.println(
                    "\nPrevious Quantity     : " + prevQtt +
                    "\nThe amount to restock : " + resQtt  +
                    "\nNew Quantity          : " + newQtt
                );

                searchFlower.setQuantity(newQtt);

            };
        }

        if (!found) {
            System.out.println("Flower " + searchName + " is not exist in list");
        }

        lineInput.close();

    }

}
