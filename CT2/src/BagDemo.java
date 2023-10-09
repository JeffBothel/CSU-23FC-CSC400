class ShoppingCart<Type> {
    private Type[] items;
    private int numberOfProducts;
    private int Default_Capacity;

    public ShoppingCart(Type type, int numberOfProducts, int Default_Capacity) {
        this.items = (Type[]) new Object[Default_Capacity];
        this.numberOfProducts = numberOfProducts;
        this.Default_Capacity = Default_Capacity;
    }

    public void add(Type item) {
        if(numberOfProducts <= Default_Capacity) {
            items[numberOfProducts] = item;
            numberOfProducts++;
        }
    }

    public void toArray(Type[] inputArray) {
        for(int i = 0; i < numberOfProducts; i++) {
            inputArray[i] = this.items[i];
        }
    }

    public boolean isFull() {
        return numberOfProducts == Default_Capacity;
    }
}

public class BagDemo {
    public static void toAddl(String[] inputArray, ShoppingCart<String> inputCart) {
        for(int i = 0; i < (inputArray.length-1); i++) {
            inputCart.add(inputArray[i]);
        }
    }

    public static String displayBag(ShoppingCart<String> inputCart) {
        String[] cartItems = new String[10];
        inputCart.toArray(cartItems);
        String output = "";
        output += "The items in the cart are:\n";
        for(int i = 0; i < cartItems.length; i++) {
            output += cartItems[i] + "\n";
        }
        return output;
    }
    
    // Main entry point for the program
    public static void main(String[] args) throws Exception {
        System.out.println("Simple program to test out ShoppingCart class");
        ShoppingCart<String> cart = new ShoppingCart<String>("", 0, 10); // Defaulting with 10 to start to just give examples of the working class
        
        // After each fruit example it will test the isFull() method
        System.out.println("Putting an Apple in the inventory...");
        cart.add("Apple");
        System.out.println("Is the cart full: " + cart.isFull());

        System.out.println("Putting an Orange in the inventory...");
        cart.add("Orange");
        System.out.println("Is the cart full: " + cart.isFull());

        System.out.println("Putting a Banana in the inventory...");
        cart.add("Banana");
        System.out.println("Is the cart full: " + cart.isFull());

        System.out.println("Putting a Pear in the inventory...");
        cart.add("Pear");
        System.out.println("Is the cart full: " + cart.isFull());

        System.out.println("Putting a Pineapple in the inventory...");
        cart.add("Pineapple");
        System.out.println("Is the cart full: " + cart.isFull());

        System.out.println("Putting a Watermelon in the inventory...");
        cart.add("Watermelon");
        System.out.println("Is the cart full: " + cart.isFull());

        System.out.println("Putting a Strawberry in the inventory...");
        cart.add("Strawberry");
        System.out.println("Is the cart full: " + cart.isFull());

        System.out.println("Putting a Blueberry in the inventory...");
        cart.add("Blueberry");
        System.out.println("Is the cart full: " + cart.isFull());

        System.out.println("Putting a Raspberry in the inventory...");
        cart.add("Raspberry");
        System.out.println("Is the cart full: " + cart.isFull());

        System.out.println("Putting a Blackberry in the inventory...");
        cart.add("Blackberry");
        System.out.println("Is the cart full: " + cart.isFull());

        // Generating the array that will be used in output to the users from the class to test the toArray() method
        String[] cartItems = new String[10];
        cart.toArray(cartItems);
        System.out.println("\nThe items in the cart are:");
        for(int i = 0; i < cartItems.length; i++) {
            System.out.println(cartItems[i]);
        }

        // toAddl() and displayBag() method test
        System.out.println("\nTesting the toAddl() method...");
        String[] newFruits = {"Kiwi", "Mango", "Peach", "Plum", "Grape", "Cherry", "Lemon", "Lime", "Coconut", "Papaya"};        
        ShoppingCart<String> newCart = new ShoppingCart<String>("", 0, newFruits.length);
        toAddl(newFruits, newCart); // Executing the method to add the fruits to the cart
        
        System.out.println("\nTesting the displayBag() method...");
        System.out.println(displayBag(newCart)); // Executing the method to display the contents of the cart)       

        // Testing to see what happens when we ask to add another item to the cart
        System.out.println("Putting a Kiwi in the inventory...");
        cart.add("Kiwi");
        System.out.println("Is the cart full: " + cart.isFull());
    }
}