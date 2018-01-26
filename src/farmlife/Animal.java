package farmlife;

/**
 * Animal Base Class
 * @author Rodrigo Rente Nº2385 (rodrigo.rente@estudantes.ips.pt)
 */
public class Animal
{
    private int stamina;            // the amount of stamina it currently has
    private boolean isSleeping;     // whether or not the animal is sleeping
    private int staminaToRun;       // the amount of stamina used for running
    
    public Animal()
    {
        stamina = 10000;
        isSleeping = false;
        
        staminaToRun = 1000;
    }
    
    public Animal(int staminaToRun)
    {
        stamina = 10000;
        isSleeping = false;
        
        this.staminaToRun = staminaToRun;
    }
    
    public void run()
    {
        stamina -= staminaToRun;
    }
    
    public void sleep()
    {
        isSleeping = true;
    }
}
