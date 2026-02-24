
package javaestudos;

import javaestudos.Conversor.Animal;

class Main {
    //CLASSE NÚMERO 1
    public static class Pessoa{
        String nome;
        int idade;

        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

        public void falar(){
            System.out.println("GUGUDADÁ!?");
        }

        
    }
    public static void main(String[] args) {
        Pessoa novoHumano = new Pessoa("JOnas", 17);
        novoHumano.falar();
        Animal novoAnimal = new Animal("Thunder", 60);
        novoAnimal.falar();
    }
    
} 