import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    String nome = sc.next();
    System.out.println("Digite seu sobrenome: ");
    String sobre = sc.next();
    System.out.println("Digite sua idade: ");
    Double idade = sc.nextDouble();
    System.out.println("Digite sua altura: ");
    Double alt = sc.nextDouble();
    System.out.println("Digite seu sexo: ");
    String sexo = sc.next();

    System.out.println("Olá, " + nome + " " + sobre + " fizemos uma breve analise das informações passadas e temos as seguintes informações a repassar:");
  sc.close();
  }
}