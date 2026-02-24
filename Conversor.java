package javaestudos;

import javaestudos.Main.Pessoa;

class Conversor{
    public static class Animal extends Pessoa{
        
        public Animal(String nome, int idade){
            super(nome, idade);
            
        }

        @Override
        public void falar(){
            System.out.println("RUgidos.");
        }
    }
    public static void main(String[] args) {
        Animal novoAnimal = new Animal("Vegeta", 40);
        novoAnimal.falar();
    }
}
