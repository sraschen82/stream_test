package stream_test.statistic;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import stream_test.domain.Doacao;


  abstract class Statistics {

    static IntSummaryStatistics get(final List<Doacao> doacoes , final String type){
        final Map<String, List<Doacao>> doacoesPorTipo = doacoes.stream()
                .collect(Collectors.groupingBy(d -> d.getTipoDoacao().getSimpleName()));

        return doacoesPorTipo.get(type).stream()
        .collect(Collectors.summarizingInt(d -> d.getTipoDoacao().getQuantidade()));
         

    }

    static String show (final List<Doacao> doacoes) {
        final IntSummaryStatistics statsAlim = Statistics.get(doacoes, "Alimento");
        final IntSummaryStatistics statsML = Statistics.get(doacoes, "Material de Limpeza");
        final IntSummaryStatistics statsMH = Statistics.get(doacoes, "Material de Higiene");

        return "Estatísticas das doações de alimentos: \n" +
                "Número de doações: " + statsAlim.getCount() + "\n" +
                "Total arrecadado: " + statsAlim.getSum() + "\n" +
                "Maior doação: " + statsAlim.getMax() + "\n" +
                "Menor doação: " + statsAlim.getMin() + "\n" +
                "Média das doações: " + statsAlim.getAverage() + "\n\n" +
                "Estatísticas das doações de materiais de limpeza: \n" +
                "Número de doações: " + statsML.getCount() + "\n" +
                "Total arrecadado: " + statsML.getSum() + "\n" +
                "Maior doação: " + statsML.getMax() + "\n" +
                "Menor doação: " + statsML.getMin() + "\n" +
                "Média das doações: " + statsML.getAverage() + "\n\n" +
                "Estatísticas das doações de materiais de higiene: \n" +
                "Número de doações: " + statsMH.getCount() + "\n" + 
                "Total arrecadado: " + statsMH.getSum() + "\n" +
                "Maior doação: " + statsMH.getMax() + "\n" +
                "Menor doação: " + statsMH.getMin() + "\n" +
                "Média das doações: " + statsMH.getAverage() + "\n\n";
                 
    }

    
}
