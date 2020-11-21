/*
 * Números Pares entre 1000 e 1500.
 */
package numerospares_fabiana.java;

/**
 *
 * @Fabiana Gontijo
 */
public class Numerospares_FabianaJava {

    
    public static void main(String[] args) {
    
        int V,i;
        
        for (i=1000; i<=1500; i++)
        {
            V = i%2;
            if (V ==0)
            {
                System.out.println("Números Pares="+i);
            }
        }
    }
    
}
