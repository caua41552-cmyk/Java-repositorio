import java.util.HashMap;
import java.util.Scanner;
// import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        HashMap <String, String> biblioteca = new HashMap<>(); 

        for (int i = 1; i < 4; i ++){
            System.out.print("Digite o nome do %d° livro: ".formatted(i));
            String tituloLivro = scanner.nextLine();
            System.out.print("Digite o nome do autor do livro: ".formatted(i));
            String autorLivro = scanner.nextLine();
            biblioteca.put(tituloLivro, autorLivro);
        }

        for(var todosLivros: biblioteca.entrySet()){
            System.out.println("Livro: %s ||| Autor: %s .".formatted(todosLivros.getKey(), todosLivros.getValue()));
        }

        scanner.close();
    }
}