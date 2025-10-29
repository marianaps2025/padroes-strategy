package br.padroes.strategy.app;

import br.padroes.strategy.model.Disciplina;
import br.padroes.strategy.strategy.Aritmetica;
import br.padroes.strategy.strategy.Geometrica;
import br.padroes.strategy.strategy.MediaStrategy;

public class Main {
    public static void main(String[] args) {

        // === Teste com Média Aritmética ===
        MediaStrategy estrategia = new Aritmetica();
        Disciplina d = new Disciplina(estrategia);

        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();

        System.out.println(estrategia.toString());
        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());

        System.out.println();

        // === Teste com Média Geométrica ===
        estrategia = new Geometrica();
        d.setEstrategia(estrategia);
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();

        System.out.println(estrategia.toString());
        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
    }
}