package projetoimovel;

import java.util.Scanner;

public class ProjetoImovel {

    public static void main(String[] args) {
      
      
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite 1 para imóvel novo, e digite 2 para imóvel velho");
      int a = leia.nextInt();       
      
      switch(a){
          case 1:
              Novo novo = new Novo();
              novo.setPreco(3000);
              novo.setEndereco("Rua das Abelhas, 123");
              novo.nota();
          break;
          case 2:
              Velho old = new Velho();
              old.setPreco(3000);
              old.setEndereco("Rua das Abelhas, 123");
              old.nota();
      }
    }
    
}
