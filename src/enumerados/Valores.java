package enumerados;

public enum Valores
{
    DOALR(3199);

    private int valor;

    Valores(int i)
    {
        this.valor = i;
    }

    public int getValor()
    {
        return valor;
    }
}
