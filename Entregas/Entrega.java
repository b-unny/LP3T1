import java.util.ArrayList

public class Entrega
{
    private String entregador;
    private int x, y;
    private ArrayList<String> caminho;


    public Entrega(String nome, int xi, int yi)
    {
        entregador=nome;
        x=xi;
        y=yi;
        caminho=new ArrayList<>();
        caminho.add("["+x","+y"]");
    }

    private void registrarCaminho()
    {
        caminho.add("["+x","+y"]");
    }
    
    //Norte  y--
    public void moverNorte(int quadras){
        y -= quadras;
        registrarCaminho();
    }
    //Sul    y++
    public void moverSul(int quadras){
        y += quadras;
        registrarCaminho();
    }
    //Oeste  x--
    public void moverOeste(int quadras){
        x-=quadras;
        registrarCaminho();
    }
    //Leste  x++
    public void moverLeste(int quadras){
        x+=quadras;
        registrarCaminho();
    }
    
}