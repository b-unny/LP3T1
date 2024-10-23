public class Carro extends Entrega
{
    private double consumo;

    Carro(String nome, int xi, int yi, double consumo)
    {
        super(nome, xi, yi);
        this.consumo=consumo;
    }

    public double ConsumoTotal()
    {
        int distancia=calcDistancia();
        return distancia*consumo;
    }
}