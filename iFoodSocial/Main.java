import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int numProdutos=3;

        Produto[] produtos = new Produto[numProdutos];
        
        Categoria lanche = new Categoria(1, "Lanche");
        Categoria bebida = new Categoria(2, "Bebida");

        for(int i=0; i<numProdutos; i++)
        {
            System.out.print("Digite o codigo do produto: ");
            produtos[i].setCodigo(scan.nextInt());
            System.out.print("Digite a descrição: ");
            produtos[i].setDescricao(scan.nextLine());
            System.out.print("Digite o valor: R$");
            produtos[i].setValor(scan.nextDouble());

        }

        System.out.println("Cardápio");
        lache.getExplicacao();
        for(Produto p: produtos)
        {
            System.out.println(p.getDescricao);
            System.out.println(p.getCodigo);
            System.out.println("R$"+p.getValor);
            System.out.println("-------------");
        }
    }
}