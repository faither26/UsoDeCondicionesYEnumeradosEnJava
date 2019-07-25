package enumerados;

public enum Constates
{
    MENSAJE_CUADRO("Hola Mundo"), MENSAJE_TITULO("ejemplo"), MENSAJE_DOLAR_ALTO("El dólar esta muy caro"),
    MENSAJE_DOLAR_BAJO("El dólar esta muy bajo"),MENSAJE_INGRESA_VALOR("Ingresa un valor");

    private String mensaje;

    Constates(String s)
    {
        this.mensaje = s;
    }

    public String getMensaje()
    {
        return mensaje;
    }

}
