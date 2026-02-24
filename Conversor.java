package javaestudos;

import javaestudos.Main.Pessoa;

class Conversor{
    public static class Animal extends Pessoa{
        
        public Animal(String nome, int idade){
            super(nome, idade);
            
        }

        public void falar(){
            System.out.println("Nome: " + nome + " | Idade: " + idade);
        }
    }
    public static void main(String[] args) {
        Animal novoAnimal = new Animal("Vegeta", 40);
        novoAnimal.falar();
    }
}