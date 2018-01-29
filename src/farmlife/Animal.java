package farmlife;

/**
 * Animal Base Class
 * @author Rodrigo Rente Nº2385 (rodrigo.rente@estudantes.ips.pt)
 */
public abstract class Animal
{
    protected int stamina;          // the amount of stamina it currently has
    private boolean sleeping;       // whether or not the animal is sleeping
    private int staminaToRun;       // the amount of stamina used for running
    
    public Animal(int stamina, int staminaToRun)
    {
        this.stamina = stamina;
        isSleeping = false;
        
        this.staminaToRun = staminaToRun;
    }
    
    public void run()
    {
        stamina -= staminaToRun;
    }

    public boolean isAsleep()
    {
        return sleeping;
    }
    
    public void sleep()
    {
        isSleeping = true;
    }
}
