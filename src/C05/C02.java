package C05;

import java.util.ArrayList;
import java.util.Arrays;

public class C02 {



    public static void main(String[] args) {

        ArrayList<Customer> kullanici = new ArrayList<>();


        Customer customer = new Customer("Ramzan",42);
        System.out.println(customer.name+" "+ customer.alt);
        customer.name= "Kerim";
        customer.alt = 15;
        System.out.println(customer.name+ " " +  customer.alt);
    }
}
