package stream_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachTest {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    

        // lista.forEach(System.out::println);

        lista.forEach( n-> 
        {
            if (n % 2 == 0) {
                System.out.println("Número par: " + n);
            } else {
                System.out.println("Número ímpar: " + n);
            }
        }
        
        );
    }
    
    

}
