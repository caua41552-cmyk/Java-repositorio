package javaestudos;

public class Conversor {
    String nome;
    int level;

    public Conversor(String nome, int level){
        this.nome = nome;
        this.level = level;
    }

    public void status(){
        System.out.println("Personagem: %s || Filme: %d.".formatted(nome, level));
    }
}