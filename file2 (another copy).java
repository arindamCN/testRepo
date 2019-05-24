// Java program to illustrate 
// implementing Ennead Class  
// from Octet Class  
// using direct values 
  
import java.util.*; 
import org.javatuples.*; 
  
class GfG { 
  
    public static void main(String[] args) 
    { 
        // Create Octet 
        Octet<String, String, String, String, String, String, String, String> 
            octet = new Octet<String, String, String, String, String, String, String, String>( 
                "Octet", "Septet", "Sextet", "Quintet", "Quartet", "Triplet", "Pair", "Unit"); 
  
        // Print the Octet 
        System.out.println("Octet: " + octet); 
  
        // Create Ennead from Octet 
        Ennead<String, String, String, String, String, String, String, String, String> 
            ennead = new Ennead<String, String, String, String, String, String, String, String, String>( 
                "Ennead", 
                octet.getValue0(), 
                octet.getValue1(), 
                octet.getValue2(), 
                octet.getValue3(), 
                octet.getValue4(), 
                octet.getValue5(), 
                octet.getValue6(), 
                octet.getValue7());

	Ennead<String, String, String, String, String, String, String, String, String> 
            ennead = new Ennead<String, String, String, String, String, String, String, String, String>( 
                "Ennead", 
                octet.getValue0(), 
                octet.getValue1(), 
                octet.getValue2(), 
                octet.getValue3(), 
                octet.getValue4(), 
                octet.getValue5(), 
                octet.getValue6(), 
                octet.getValue7());  
  
        // Print the Ennead 
        System.out.println("Ennead: " + ennead); 
    } 
} 
