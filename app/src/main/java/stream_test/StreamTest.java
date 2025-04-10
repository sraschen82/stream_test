package stream_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
       

    List<Integer> lista = new ArrayList<>(Arrays.asList(10, 2, 1, 8, 5, 8, 7, 5, 9, 10));
    System.out.println("\n-----------------\n");
    System.out.println(lista);
    
    lista.stream()
        .filter(n -> n > 5)
        .map(n -> n * 2)
        .distinct()
        .sorted()
        .forEach(System.out::println);

        System.out.println("\n-----------------\n");

     Integer soma = lista.stream()
        .filter(n -> n% 2 == 0)
        .reduce(0 ,(a, b) -> a + b);
    System.out.println("Soma: " + soma);
      
    System.out.println("\n-----------------\n");
//   Optional<Integer> soma = lista.stream()
//     .filter(n -> n% 2 == 0)
//     .reduce((a, b) -> a + b);

    // System.out.println("Soma: " + soma.orElse(0));
         
   


// List<Doacao> doacoes = new FakeData().getFakeDoacoes();      


// List<Integer> alimento = 

// doacoes.stream()
// .filter(d-> d.getTipoDoacao().getSimpleName().equals("Alimento"))
// .map(a->a.getTipoDoacao().getQuantidade())
// .forEach(System.out::println);

// int somaAlimentos = doacoes.stream()
// .filter(d-> d.getTipoDoacao().getSimpleName().equals("Alimento"))
// .map(a->a.getTipoDoacao().getQuantidade())
// .reduce(0, (a,b)-> a+b);

// System.out.println("Total de alimentos doados: " + somaAlimentos);



    }
    
}
