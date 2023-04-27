package br.edu.univas;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<Livro>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Remover livro");
            System.out.println("3 - Buscar livro por título");
            System.out.println("4 - Buscar livro por área de interesse");
            System.out.println("5 - Buscar livro por nome do autor");
            System.out.println("6 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a área de interesse do livro: ");
                    String area = scanner.nextLine();
                    System.out.print("Digite o nome do autor do livro: ");
                    String autor = scanner.nextLine();
                    livros.add(new Livro(titulo, area, autor));
                    System.out.println("\nLivro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("\nDigite o índice do livro que deseja remover: ");
                    int indice = scanner.nextInt();
                    livros.remove(indice);
                    System.out.println("\nLivro removido com sucesso!");
                    break;
                case 3:
                    System.out.print("\nDigite o título do livro que deseja buscar: ");
                    String buscaTitulo = scanner.nextLine();
                    for (Livro livro : livros) {
                        if (livro.getTitulo().equals(buscaTitulo)) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 4:
                    System.out.print("\nDigite a área de interesse que deseja buscar: ");
                    String buscaArea = scanner.nextLine();
                    for (Livro livro : livros) {
                        if (livro.getArea().equals(buscaArea)) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 5:
                    System.out.print("\nDigite o nome do autor que deseja buscar: ");
                    String buscaAutor = scanner.nextLine();
                    for (Livro livro : livros) {
                        if (livro.getAutor().equals(buscaAutor)) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 6:
                    System.out.println("\nSaindo...");
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida!");
            }
        }
    }
}

class Livro {
    private String titulo;
    private String area;
    private String autor;

    public Livro(String titulo, String area, String autor) {
        this.titulo = titulo;
        this.area = area;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArea() {
        return area;
    }

    public String getAutor() {
        return autor;
    }

    public String toString() {
        return "Título: " + titulo + ", Área de interesse: " + area + ", Autor: " + autor;
    }
}

