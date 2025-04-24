package stream_test;

public class IntegerTest {
    public static void main(String[] args) {
        // Integer é uma classe wrapper para o tipo primitivo int
        // Ela permite que você trate números inteiros como objetos
        // Isso é útil quando você precisa usar números inteiros em coleções, como listas ou mapas
        // Além disso, a classe Integer fornece métodos úteis para manipular números inteiros

         
          
       

        Integer i = 10;
        Integer j = 5;

        
        System.out.println(i); 
        System.out.println(i.doubleValue()); // 10.0, porque o valor double
        System.out.println(i.intValue()); // 10, porque o valor int
        System.out.println(i.toString().charAt(0)); // 1, porque é o primeiro caractere da string "10"
        System.out.println(i.toString().charAt(1)); // 0, porque é o segundo caractere da string "10"
        System.out.println(i.toString().length()); // 2, porque a string "10" tem 2 caracteres
        System.out.println(i == j); // false, porque o i e j são valores diferentes
        System.out.println(i.equals(j)); // false, porque o i e j são valores diferentes
        System.out.println(i.compareTo(10)); // 0, porque os valores são iguais
        System.out.println(i.compareTo(5)); // 1, porque i é maior que 5
        System.out.println(i.compareTo(15)); // -1, porque i é menor que 15
        System.out.println(Integer.divideUnsigned(i, j)); // 2, porque 10 / 5 = 2
        System.out.println(Integer.remainderUnsigned(i, j)); // 0, porque 10 % 5 = 0
        System.out.println(Integer.sum(i, j)); // 15, porque 10 + 5 = 15
        System.out.println(Integer.max(i, j)); // 10, porque 10 é maior que 5
        System.out.println(Integer.min(i, j)); // 5, porque 5 é menor que 10

    }
}
