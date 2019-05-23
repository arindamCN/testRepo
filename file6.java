// Java program to illustrate 
// implementing Octet Class  
// from Septet Class  
// using direct values 
  
import java.util.*; 
import org.javatuples.*; 
  
class GfG { 
  
    public static void main(String[] args) 
    { 
        // Create Septet 
        Septet<String, String, String, String, String, String, String> 
            septet = new Septet<String, String, String, String, String, String, String>( 
                "Septet", "Sextet", "Quintet", "Quartet", "Triplet", "Pair", "Unit"); 
  
        // Print the Septet 
        System.out.println("Septet: " + septet); 
  
        // Create Octet from Septet 
        Octet<String, String, String, String, String, String, String, String> 
            octet = new Octet<String, String, String, String, String, String, String, String>( 
                "Octet", 
                septet.getValue0(), 
                septet.getValue1(), 
                septet.getValue2(), 
                septet.getValue3(), 
                septet.getValue4(), 
                septet.getValue5(), 
                septet.getValue6()); 
  
        // Print the Octet 
        System.out.println("Octet: " + octet); 
    } 
} 