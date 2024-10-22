public class Categoria implements IExplicavel
{
    private int codigo;
    private String descricao;

    Categoria(int codigo, String descricao)
    {
        this.codigo=codigo;
        this.descricao=descricao;
    }

    Categoria()
    {
        this.codigo=000;
        this.descricao="EMPTY";
    }

    void setCodigo(int codigo)
        this.codigo=codigo;
    
    int getCodigo()
        return codigo;

    void setDescricao(String descricao)
        this.descricao=descricao;
    
    String getDescricao()
        return descricao;
    
    @Override
    String getExplicacao()
        return "Categoria: "+getDescricao "Codigo: "+getCodigo;
}
