public class Produto extends Categoria implements IExplicavel
{
    private double valor;

    Produto()
    {
        super();
        this.valor=0.00;
    }

    Produto(int codigo, String descricao, double valor)
    {
        super(codigo, descricao);
        this.valor=valor;
    }

    void setValor(double valor)
        this.valor=valor;

    double getValor()
        return valor;

    @Override
    String getExplicacao()
        return "Produto "+getDescricao" Codigo: "+getCodigo" Valor: R$"+getValor;
    
}