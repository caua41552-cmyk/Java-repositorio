package javaestudos;

public class ContaEspecial extends Conversor{
    public int forca;
    
    public ContaEspecial(int forca, String nome, int level){
        super (nome, level);
        this.forca = forca;
    }

    public void atacar(){
        System.out.println("[%s] atacou com força de [%d].".formatted(nome, forca));
    }

    @Override
    public void status() {
    // Aqui está o pulo do gato!
    System.out.println("--- STATUS DE GUERREIRO ---");
    System.out.println("Nome: " + this.nome);
    System.out.println("Nível: " + this.level);
    System.out.println("Poder de Ataque: " + this.forca);
}
}