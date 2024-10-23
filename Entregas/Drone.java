public class Drone extends Entrega
{
    Drone(String nome, int xi, int yi)
        super(nome, x, y);

    public void moverDireto(int xf, int yf)
    {
        x=xf;
        y=yf;
        registrarCaminho();
    }
}