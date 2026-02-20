package javaestudos;

public class Main {
    public static void main(String[] args) {

        Conversor NPC = new Conversor("Carinha", 6);
        ContaEspecial guerreiro = new ContaEspecial(50, "Arghon", 50);

        NPC.status();
        guerreiro.status();
        guerreiro.atacar();
    }
}