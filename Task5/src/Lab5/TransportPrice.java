package Lab5;
import java.util.*;
class Transport {
    void ticketPrice() {
        System.out.println("Ticket price for transport is not defined.");
    }
}
class Bus extends Transport {
    @Override
    void ticketPrice() {
        System.out.println("Bus ticket price is 50rs.");
    }
}
class Train extends Transport {
    @Override
    void ticketPrice() {
        System.out.println("Train ticket price is 100rs.");
    }
}

public class TransportPrice {
    public static void main(String[] args) {
        Transport t1 = new Bus();     
        Transport t2 = new Train();  

        t1.ticketPrice(); 
        t2.ticketPrice(); 
    }
}
