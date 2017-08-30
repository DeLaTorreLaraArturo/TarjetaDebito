/**
 * @author Arturo De La Torre Lara
 * @Version 30 de Agosto del 2017 
 */
public class Tarjeta
{
    private double saldo;
    
    public Tarjeta()
    { 
        saldo = 0;
    }
    
    /**
     * Metodo para depositar el dinero a la cuenta (tarjeta)
     * @param dinero variable en donde se guarda el dinero que se ingresa para acomularcelo al saldo
     */
    public void depositar(double dinero)
    {
        if(dinero > 0)
        {
            saldo = saldo + dinero;
        }
    }
    /**
     * Metodo para restarle a la cuenta el dinero que desea retirar y checar si se puede
     * @param dinero Recibe el valor que quiere retirar 
     * @return Retorna el dinero que se retiro si se pudo y retorna 0 si no se puede retirar  
     */
    public double retirar(double dinero)
    {
        if (saldo >= dinero)
        {
            saldo = saldo - dinero;
            return dinero;
        }
        else
            return 0; 
    }
    /**
     * Metodo para saber el saldo actual en la tarjeta
     * @return Retorna el saldo actual
     */
    public double consultar()
    {
        return saldo;
    }
}