package stream_test;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

import stream_test.data.FakeData;
import stream_test.domain.Doacao;

public class MapTest {
    public static void main(String[] args) {

        // Map<Integer,String> map = new HashMap<>();

        
        // map.put(1, "Samuel");
        // map.put(2, "Camille");
        // map.put(3, "Matheus");
        // map.put(4, "Gabriel");
        // map.put(5, "Bruno");
        // map.put(6, "Henrique");
        // map.put(7, "Vítor");
        // map.put(8, "Guilherme");

        // map.forEach((k,v) -> System.out.println(k + ": " + v));
        // System.out.println("--------------------------------------------------");
        // System.out.println("Tamanho do mapa: " + map.size());
        // System.out.println("Chaves do mapa: " + map.keySet());
        // System.out.println("Valores do mapa: " + map.values());
        // System.out.println("Tem chave igual a 3? "+map.containsKey(3));
        // System.out.println("Tem chave igual a 20? "+map.containsKey(20));
        // System.out.println("Tem valor igual a Samuel? "+map.containsValue("Samuel"));
        // System.out.println("Tem valor igual a Waldy? "+map.containsValue("Waldy"));
        // System.out.println("Valor com a chave 2: "+map.get(2));
       

       
        // System.out.println("--------------------------------------------------");

        List<String> meses = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");

        List<Integer> lucros = List.of(1000, 800, 700, 1400, 1500, 800, 750, 800, 1100, 1000, 150, 1200);

        Map<String, Integer> lucroPorMes = new LinkedHashMap<>();
        // Map<String, Integer> lucroPorMes = new HashMap<>();

        // for (int i = 0; i < 12; i++) {
        //         lucroPorMes.put(meses.get(i), lucros.get(i));
        //             }
        // System.out.println(lucroPorMes);

        // System.out.println("Janeiro: " +lucroPorMes.get("Janeiro"));
        // System.out.println("Meses: " +lucroPorMes.keySet());
        // System.out.println("Lucros: " +lucroPorMes.values());


        // Map<String, Integer> lucroPorMesComStreamToMap = meses.stream()
        //         .collect(Collectors.toMap(m -> m, m -> lucros.get(meses.indexOf(m))));

              
        // System.out.println("--------------------------------------------------");
        // lucroPorMesComStreamToMap .forEach((k,v) -> System.out.println(k + ": " + v));
        // System.out.println("--------------------------------------------------");




        List<Doacao> doacoes = new FakeData().getFakeDoacoes();

        Map<String, List<Doacao>> doacoesPorTipo = doacoes.stream()
                .collect(Collectors.groupingBy(d -> d.getTipoDoacao().getSimpleName()));

                // System.out.println(doacoesPorTipo);

        System.out.println("Doações agrupadas por tipo: \n" + "Alimento\n" + doacoesPorTipo.get("Alimento") + "\n" +
                "Material de Limpeza\n" + doacoesPorTipo.get("Material de Limpeza") + "\n" +
                "Material de Higiene\n" + doacoesPorTipo.get("Material de Higiene"));

        IntSummaryStatistics statsAlim = doacoesPorTipo.get("Alimento").stream()
                .collect(Collectors.summarizingInt(d -> d.getTipoDoacao().getQuantidade()));

        System.out.println("-------------------------\n");

       

        System.out.println("Estatísticas de doações de alimentos: ");
        System.out.println("Total: " + statsAlim.getSum());
        System.out.println("Máximo: " + statsAlim.getMax());
        System.out.println("Mínimo: " + statsAlim.getMin());
        System.out.println("Contagem: " + statsAlim.getCount());
        System.out.println("Média: " + statsAlim.getAverage());


        System.out.println("-------------------------\n");

        IntSummaryStatistics statsML = doacoesPorTipo.get("Material de Limpeza").stream()
                .collect(Collectors.summarizingInt(d -> d.getTipoDoacao().getQuantidade()));

        System.out.println("Estatísticas de doações de materiais de limpeza: ");
        System.out.println("Total: " + statsML.getSum());
        System.out.println("Máximo: " + statsML.getMax());
        System.out.println("Mínimo: " + statsML.getMin());
        System.out.println("Contagem: " + statsML.getCount());
        System.out.println("Média: " + statsML.getAverage());

        System.out.println("-------------------------\n");

        IntSummaryStatistics statsMH = doacoesPorTipo.get("Material de Higiene").stream()
                .collect(Collectors.summarizingInt(d -> d.getTipoDoacao().getQuantidade()));

        System.out.println("Estatísticas de doações de materiais de higiene: ");
        System.out.println("Total: " + statsMH.getSum());
        System.out.println("Máximo: " + statsMH.getMax());
        System.out.println("Mínimo: " + statsMH.getMin());
        System.out.println("Contagem: " + statsMH.getCount());
        System.out.println("Média: " + statsMH.getAverage());

    }
}
