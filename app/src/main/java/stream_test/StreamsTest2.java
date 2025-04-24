package stream_test;

import java.util.List;
import java.util.stream.Collectors;

import stream_test.data.FakeData;
import stream_test.domain.Doacao;

public class StreamsTest2 {

    public static void main(String[] args) {

        List<Doacao> doacoes = new FakeData().getFakeDoacoes();

        // List<Integer> alimento = doacoes.stream()
        //         .filter(d -> d.getTipoDoacao().getSimpleName().equals("Alimento"))
        //         .map(a -> a.getTipoDoacao().getQuantidade())
        //         .collect(Collectors.toList());

        // System.out.println("Alimentos doados: " + alimento);

        // doacoes.stream()
        // .filter(d -> d.getTipoDoacao().getSimpleName().equals("Alimento"))
        // .map(a -> a.getTipoDoacao().getQuantidade())
        // .forEach(System.out::println);

        int somaAlimentos = doacoes.stream()
        .filter(d -> d.getTipoDoacao().getSimpleName().equals("Alimento"))
        .map(a -> a.getTipoDoacao().getQuantidade())
        .reduce(0, (a, b) -> a + b);

        System.out.println("Total de alimentos doados: " + somaAlimentos);

    }
}
