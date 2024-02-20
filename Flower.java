/** 
 * Description: Managing flower inventory for Floral Bliss
 * Programmer: Zul Iskandar bin Zainorhan
 * 
 * Date: 20/2/2024
 */

public class Flower{
    // Instances [Variable] Declaration
    private String name, color;
    private double price;
    private int quantity;

    // Constructors
    /** Construct an object with no initial value[NULL] */
    public Flower() {
        name = color = "";

        price = 0.00;
        quantity = 0;

    }

    /** Construct an object with specified initial value[NULL] */
    public Flower(String name, String color, double price, int quantity) {
        this.name  = name;
        this.color = color;

        this.price = price;
        this.quantity = quantity;

    }

    // Mutators [Changer/Updater]
    /** To change/update all variable */
    public void updateFlower(String name, String color, double price, int quantity) {
        this.name  = name;
        this.color = color;

        this.price = price;
        this.quantity = quantity;
    }

    /** To set a Name */
    public void setName(String name) {
        this.name  = name;
    }

    /** To set a Color */
    public void setColor(String color) {
        this.color = color;
    }

    /** To set a Price */
    public void setPrice(double price) {
        this.price = price;
    }

    /** To set a Quantity */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Accessors
    /** To access the Name */
    public String getName() {
        return this.name;
    }

    /** To access the Color */
    public String getColor() {
        return this.color;
    }

    /** To access the Price */
    public double getPrice() {
        return this.price;
    }

    /** To access the Quantity */
    public int getQuantity() {
        return this.quantity;
    }

    // toString
    /** Return the Object as a strings */
    public String toString() {
        return 
            "\nFlower: " + this.name +
            "\nColor: " + this.color +
            "\nPrice: " + this.price +
            "\nQuantity: " + this.quantity;
    }

    // Mutators
    /** Calculate the value of the flower:
     * Value = Price * Quantity
     */
    public double calculateValue() {
        double value = this.price * this.quantity;
        return value;
    }

}
