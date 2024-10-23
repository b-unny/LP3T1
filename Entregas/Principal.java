import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner scan=new scanner(System.in);
        Entrega entrega=null;
        int pxi=0, pyi=0, opcao=0;

        System.out.println("Tipo de entrega: 1. A pé  2. De carro  3. Por drone");    
        int TEntrega = scan.nextInt();

        System.out.println("Nome do entregador: ");
        String nome = scan.nextLine();

        switch(TEntrega)
        {
            case 1:
                entrega=new APe(nome, pxi, pyi);
                break;
            case 2:
                System.out.print("Consumo medio do carro: ");
                double cMedio=scan.nextDouble();
                entrega=new Carro(nome, pxi, pyi, cMedio);
                break;
            case 1:
                entrega=new Drone(nome, pxi, pyi);
                break;
            default:
                System.out.println("Opcao invalida.");
                exit(0);
        } 
        while(opcao!=7)
        {
            System.out.println("Movimentacao");
            System.out.println("1. Mover Norte");
            System.out.println("2. Mover SUl");
            System.out.println("3. Mover a Leste");
            System.out.println("4. Mover a Oeste");
            System.out.println("5. Visualizar mapa");
            System.out.println("6. Mostra Percursso");
            System.out.println("7. Sair");
            opcao=scan.nextInt();

            System.out.print("Nro de quadras a movimentar: ");
            int quadras=scan.nextInt;

            switch(opcao)
            {
                case 1:
                    entrega.moverNorte(quadras);
                    break;
                case 2:
                    entrega.moverSul(quadras);
                    break;
                case 3:
                    entrega.moverLeste(quadras);
                    break;
                case 4:
                    entrega.moverOeste(quadras);
                    break;
                case 5:
                    entrega.printMapa();
                    break;
                case 6:
                    entrega.mostrarCaminho();
                    break;
                case 7:
                    System.out.print("Escolhido sair");
                    return 0;
                default:
                    System.out.print("Opcao invalida")
                    break;
                
            }
        } 
    }
}