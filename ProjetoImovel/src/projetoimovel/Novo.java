package projetoimovel;

public class Novo extends Imovel{
    double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double adicional(){
        a = preco * 1.2;
        return a;
    }
    @Override
    public void nota(){
        System.out.println("Preço: R$ " + this.adicional() + "\nEndereço: " + endereco);
    }
}
