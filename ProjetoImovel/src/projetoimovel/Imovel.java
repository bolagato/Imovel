package projetoimovel;

public class Imovel {
    public double preco;
    public String endereco;
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
  
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void nota(){
        System.out.println("Preço: R$ " + preco + "\nEndereço: " + endereco);
    }
}
