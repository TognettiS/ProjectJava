import java.util.*;

public class projetoFicha{

  static String Nome;
  static int Idade;
  static char Sexo;
  static float Altura;
  static float Peso;

  public static void main(String[] args) {
    Scanner Valores = new Scanner(System.in);

    do{
      System.out.println("Digite seu nome completo:");
      Nome = Valores.nextLine();
      System.out.println("");
    }while(Nome.length() < 10  || Nome.length() > 50);

    do {
      System.out.println("Digite sua idade:");
      Idade = Valores.nextInt();
      System.out.println("");
    } while (Idade <=0 || Idade >= 100);

    do {
        System.out.println("Digite seu sexo (M ou F):");
        Sexo = Valores.next().charAt(0);
        System.out.println("");
    } while (Sexo != 'M' && Sexo != 'F');

    do {
      System.out.println("Digite sua altura:");
      Altura = Valores.nextFloat();
      System.out.println("");
    } while (Altura <= 0 || Altura >= 2);

    do {
        System.out.println("Digite seu peso:");
        Peso = Valores.nextFloat();
        System.out.println("");
    } while (Peso <= 30 || Peso >= 200);

    System.out.println("\n Nome:" + Nome);
    System.out.println("\n Idade:" + Idade);
    System.out.println("\n Sexo:" + Sexo);
    System.out.println("\n Altura:" + Altura);
    System.out.println("\n Peso:" + Peso);
  }

}
