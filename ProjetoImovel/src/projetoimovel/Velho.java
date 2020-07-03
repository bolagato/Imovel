package projetoimovel;

public class Velho extends Imovel{

    public double desconto(){
        preco = preco *0.8;
        return preco;
    }
    @Override
    public void nota(){
        System.out.println("Preço: R$ " + this.desconto() + "\nEndereço: " + endereco);
    }
}
