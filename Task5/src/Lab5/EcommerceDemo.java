package Lab5;
import java.util.*;
//Base class
class Order {
 void printDetails() {
     System.out.println("Order ID: 90104");
     System.out.println("Customer Name: Jai");
 }
}

//Subclass
class OnlineOrder extends Order {
 @Override
 void printDetails() {
     super.printDetails(); // Call parent class method
     System.out.println("Delivery Address: Home");
     System.out.println("Estimated Delivery: Tomorrow");
 }
}

//Main class to test super in overriding
public class EcommerceDemo {
 public static void main(String[] args) {
     OnlineOrder order = new OnlineOrder();
     order.printDetails();
 }
}

