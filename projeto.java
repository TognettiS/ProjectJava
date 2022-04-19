import java.util.*;
import java.io.IOException;

public class projeto{
    int [] selecionar = {1,2,3};
    static String [] produtos = {"1-Pao", "2-Manteiga", "3-Cafe"};
    static String [] produtoP = {"Validade: 23/05/2022", "Marca: Panco", "Preco: R$ 8,99", "Lote: 233221"};
    static String [] produtoM = {"Validade: 12/08/2022", "Marca: Qualy", "Preco: R$ 5,35", "Lote: 400212"};
    static String [] produtoC = {"Validade: 30/05/2022", "Marca: Pilao", "Preco: R$ 9,99", "Lote: 684567"};


  public static void main(String[] args) {
    int x = 1;
      while (x==1) {
        System.out.println("Escolha o produto que deseja ver os dados:");
        System.out.println("Produtos:" + Arrays.toString(produtos));
        System.out.println("");

        Scanner produto = new Scanner (System.in);
        int teste = produto.nextInt();


        switch (teste){
          case 1:
           System.out.println(""+ Arrays.toString(produtoP));
           System.out.println("");
           x=2;
           break;


         case 2:
           System.out.println("" + Arrays.toString(produtoM));
           System.out.println("");
           x=2;
           break;


         case 3:
           System.out.println("" + Arrays.toString(produtoC));
           System.out.println("");
           x=2;
           break;

        }
        if (x==2) {
          System.out.println("Deseja consultar outro produto?");
          System.out.println("Pressione 's' para sim e 'n'  para nao\n");
          Scanner sn = new Scanner (System.in);
          char opcao = sn.next().charAt(0);
            if (opcao == 's') {
              x=1;
            }
            else
              System.out.println("Obrigado por consultar nossos produtos!");
        }



      }





  }
}
