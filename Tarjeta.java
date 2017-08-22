
public class Tarjeta
{
    private double saldo;
    
    public Tarjeta()
    { 
        saldo = 0;
    }
    public void depositar(double dinero)
    {
        saldo = saldo + dinero;
    }
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
    public void consultar()
    {
        System.out.println("Su saldo actual es de: " + saldo);
    }
}