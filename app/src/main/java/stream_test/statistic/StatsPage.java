package stream_test.statistic;


import java.util.IntSummaryStatistics;
import java.util.List;

import stream_test.data.FakeData;
import stream_test.domain.Doacao;




public class StatsPage {

  public static void main(String[] args) {

    // UI
    List<Doacao> doacoes = new FakeData().getFakeDoacoes();
    // String statsDoacoes = Statistics.show(doacoes);

    // System.out.println(statsDoacoes);
      final IntSummaryStatistics statsAlim = Statistics.get(doacoes, "Alimento");
        final IntSummaryStatistics statsML = Statistics.get(doacoes, "Material de Limpeza");
        final IntSummaryStatistics statsMH = Statistics.get(doacoes, "Material de Higiene");

        long total = statsAlim.getSum() + statsML.getSum() + statsMH.getSum();

        System.out.println("Total de doações: " + total);

    
    // System.out.println(Statistics.show(doacoes));

  
  
}}
