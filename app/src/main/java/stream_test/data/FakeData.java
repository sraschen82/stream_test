package stream_test.data;

import java.util.ArrayList;
import java.util.List;

import stream_test.domain.Doacao;
import stream_test.domain.Pessoa;
import stream_test.domain.doacao.Alimento;
import stream_test.domain.doacao.MaterialHigiene;
import stream_test.domain.doacao.MaterialLimpeza;

public class FakeData {

    public FakeData() {
    }

    
    public static List<Doacao> getFakeDoacoes() {
        ArrayList<Doacao> doacoes = new ArrayList<>();
        doacoes.add(new Doacao(new Pessoa("João", "5199123456", "Rua Ados Bobos, nº 0"), new Alimento(50)));
        doacoes.add(new Doacao(new Pessoa("Maria", "5199123456", "Rua Ados Bobos, nº 0"), new Alimento(20)));
        doacoes.add(new Doacao(new Pessoa("José", "5199123456", "Rua Ados Bobos, nº 0"), new Alimento(30)));
        doacoes.add(new Doacao(new Pessoa("Ana", "5199123456", "Rua Ados Bobos, nº 0"), new MaterialLimpeza(40)));
        doacoes.add(new Doacao(new Pessoa("Carlos", "5199123456", "Rua Ados Bobos, nº 0"), new MaterialLimpeza(50)));
        doacoes.add(new Doacao(new Pessoa("Fernanda", "5199123456", "Rua Ados Bobos, nº 0"), new MaterialHigiene(60)));
        doacoes.add(new Doacao(new Pessoa("Lucas", "5199123456", "Rua Ados Bobos, nº 0"), new MaterialHigiene(70)));
        doacoes.add(new Doacao(new Pessoa("Mariana", "5199123456", "Rua Ados Bobos, nº 0"), new Alimento(80)));
        
       
        return doacoes;
    }
    
}
